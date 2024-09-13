package com.example.CRUD_Operation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
public class Employee {
       @Id
       @GeneratedValue
        private Integer employeeId;
        private String name;
        private String email;
        private Double salary;
        private String jobRole;
}
