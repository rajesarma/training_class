package com.sarma.rs.service;

import com.sarma.rs.dto.EmployeeDto;
import com.sarma.rs.dto.Response;
import com.sarma.rs.entity.EmployeeEntity;
import com.sarma.rs.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeEntity> empList = employeeRepository.findAll();
        List al = new ArrayList();

        return empList.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Response response = new Response();
        EmployeeEntity savedEntity = employeeRepository.save(convert(employeeDto));
        return convert(savedEntity);
    }

    public Response updateEmployee(EmployeeDto employeeDto, Long empId) {
        Response response = new Response();
        Optional<EmployeeEntity> employeeOptional = employeeRepository.findById(empId);

        if (employeeOptional.isPresent()) {
            EmployeeEntity savedEmp = employeeOptional.get();
            savedEmp.setName(employeeDto.getName());
            savedEmp.setAge(employeeDto.getAge());
            savedEmp.setSalary(employeeDto.getSalary());
            employeeRepository.save(savedEmp);
            response.setResponseText("Employee Updated");
        } else {
            response.setResponseText("Employee not available with the ID :: " + empId);
        }
        return response;
    }

    public Response deleteEmployee(Long empId) {
        Response response = new Response();
        Optional<EmployeeEntity> employeeOptional = employeeRepository.findById(empId);

        if (employeeOptional.isPresent()) {
            employeeRepository.delete(employeeOptional.get());
            response.setResponseText("Employee Deleted");
        } else {
            response.setResponseText("Employee not available with the ID :: " + empId);
        }
        return response;
    }

    private EmployeeDto convert(EmployeeEntity employeeEntity) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employeeEntity.getId());
        employeeDto.setName(employeeEntity.getName());
        employeeDto.setAge(employeeEntity.getAge());
        employeeDto.setSalary(employeeEntity.getSalary());
        employeeDto.setBloodGroup(employeeEntity.getBloodGroup());
        return employeeDto;
    }

    private EmployeeEntity convert(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
//        employeeEntity.setId(employeeDto.getId());
        employeeEntity.setName(employeeDto.getName());
        employeeEntity.setAge(employeeDto.getAge());
        employeeEntity.setSalary(employeeDto.getSalary());
        employeeEntity.setBloodGroup(employeeDto.getBloodGroup());
        return employeeEntity;
    }

    /*public Optional<EmployeeDto> findById(Long empId) { // 2
        return employeeRepository.getAllEmployees()
                .stream()
                .filter(emp -> emp.getId().equals(empId))
                .findAny();
    }*/
}
