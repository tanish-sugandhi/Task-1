package com.example.CRUD_Operation.controller;

import com.example.CRUD_Operation.entity.Employee;
import com.example.CRUD_Operation.service.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class EmployeeController {
    @Autowired
     EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.addEmployee(employee);
    }

    @GetMapping("/getEmployee")
    public ResponseEntity<?> getAllEmployee()
    {
        return this.employeeService.getAllEmployee();
    }

    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Integer employeeId)
    {
        return this.employeeService.deleteEmployee(employeeId);
    }

    @PutMapping("/update/{employeeId}")
    public ResponseEntity<?> updateEmployee(@RequestBody Employee employee,@PathVariable Integer employeeId)
    {
        return this.employeeService.updateEmployee(employee,employeeId);
    }
    @GetMapping("get/{employeeId}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Integer employeeId)
    {
        return this.employeeService.getEmployeeById(employeeId);
    }
}
