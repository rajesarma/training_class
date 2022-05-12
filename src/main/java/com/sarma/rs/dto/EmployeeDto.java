package com.sarma.rs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDto implements Serializable {

    private static final long serialVersionUID = 2528292549891277921L;

    private Long id;
    private String name;
    private Integer age;
    private Double salary;
    private String bloodGroup;
}
