package com.example.jpa_demo.service;

import com.example.jpa_demo.entity.Employee;
import com.example.jpa_demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  @Transactional
  public Employee addEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }
}
