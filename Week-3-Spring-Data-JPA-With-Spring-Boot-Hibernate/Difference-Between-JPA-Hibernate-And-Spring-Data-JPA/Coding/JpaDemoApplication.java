package com.example.jpa_demo;

import com.example.jpa_demo.entity.Employee;
import com.example.jpa_demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

  @Autowired
  private EmployeeRepository employeeRepository;

  public static void main(String[] args) {
    SpringApplication.run(JpaDemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Employee emp = new Employee();
    emp.setName("Vaseegaran");
    emp.setDepartment("Engineering");
    employeeRepository.save(emp);
    System.out.println("Employee saved: " + emp);

    System.out.println("All Employees: " + employeeRepository.findAll());

    emp.setDepartment("R&D");
    employeeRepository.save(emp);
    System.out.println("Updated Employee: " + emp);

    employeeRepository.deleteById(emp.getId());
    System.out.println("Deleted Employee with ID: " + emp.getId());

    System.out.println("Remaining Employees: " + employeeRepository.findAll());
  }
}
