package com.sarma.rs.controller;

import com.sarma.rs.dto.EmployeeDto;
import com.sarma.rs.dto.Response;
import com.sarma.rs.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public List<EmployeeDto> getEmployees(
    ) {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{empId}")
    public EmployeeDto getEmployee(
            @PathVariable("empId") Long empId
    ) {
        return (empId == 1) ? new EmployeeDto(1L, "Raj", 39, 100.00, "A Post") : null;
    }

    @PostMapping("")
    public EmployeeDto createEmployee(
            @RequestBody EmployeeDto EmployeeDto
    ) {
        return employeeService.createEmployee(EmployeeDto);
    }

    @PutMapping
    public Response updateEmployee(
            @RequestBody EmployeeDto EmployeeDto,
            @RequestParam Long empId
    ) {
        return employeeService.updateEmployee(EmployeeDto, empId);
    }

    @DeleteMapping
    public Response deleteEmployee(
            @RequestParam Long empId
    ) {
        return employeeService.deleteEmployee(empId);
    }
}
