package com.self.empolyeeProject.repo;

import com.self.empolyeeProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
