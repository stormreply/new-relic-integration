package com.webapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
