package com.example.CRUD_Operation.repository;

import com.example.CRUD_Operation.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public Optional<Employee> findByEmail(String email);
}
