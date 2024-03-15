package com.example.customermanagement1demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
}
