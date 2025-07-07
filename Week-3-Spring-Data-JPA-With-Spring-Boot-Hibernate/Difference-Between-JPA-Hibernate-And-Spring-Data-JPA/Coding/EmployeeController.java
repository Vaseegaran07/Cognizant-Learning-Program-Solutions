package com.example.jpa_demo.controller;

import com.example.jpa_demo.entity.Employee;
import com.example.jpa_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @PostMapping
  public Employee createEmployee(@RequestBody Employee employee) {
    return employeeService.addEmployee(employee);
  }
}
