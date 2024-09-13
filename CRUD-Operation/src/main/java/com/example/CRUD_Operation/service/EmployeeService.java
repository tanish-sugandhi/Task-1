package com.example.CRUD_Operation.service;

import com.example.CRUD_Operation.entity.Employee;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {
    public ResponseEntity<?> addEmployee(Employee employee);

   public ResponseEntity<?> getAllEmployee();

   public ResponseEntity<?> deleteEmployee(Integer employeeId);

   public ResponseEntity<?> updateEmployee(Employee employee,Integer employeeId);

   public ResponseEntity<?> getEmployeeById(Integer employeeId);
}
