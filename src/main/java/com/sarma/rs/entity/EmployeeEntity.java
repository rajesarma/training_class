package com.sarma.rs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class EmployeeEntity implements Serializable {

    private static final long serialVersionUID = -637408462227832391L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq_generator")
    @SequenceGenerator(name = "emp_seq_generator", sequenceName = "employee_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "blood_group")
    private String bloodGroup;
}
