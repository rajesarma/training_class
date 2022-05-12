package com.sarma.rs.repository;

import com.sarma.rs.dto.EmployeeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
//@Repository
public class EmployeeRepositoryBkp {

    public List<EmployeeDto> getAllEmployees() {
        return prepareDummyEmployees();
    }

    public void save(EmployeeDto employee) {
        log.info("Employee Saved");
        log.info(employee.toString());
    }

    /**
     * This method is used for preparing dummy employee data
     * @return List of Employees
     */
    private List<EmployeeDto> prepareDummyEmployees() {
        List<EmployeeDto> al = new ArrayList<>();
        EmployeeDto e1 = new EmployeeDto(1L, "Raj", 39, 100.00, "A Positive");
        EmployeeDto e2 = new EmployeeDto(2L, "Sarma", 40, 200.00,"A Positive");
        EmployeeDto e3 = new EmployeeDto(3L, "Eshwar", 38, 300.00, "A Positive");
        al.add(e1);
        al.add(e2);
        al.add(e3);
        return al;
    }

    public void delete() {
        log.info("Employee Deleted");
    }
}
