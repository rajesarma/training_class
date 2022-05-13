package com.sarma.rs.repository;

import com.sarma.rs.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    /*@Override
    Optional<EmployeeEntity> findById(Long id);*/
}
