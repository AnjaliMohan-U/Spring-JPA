package com.example.Day2.repository;

import com.example.Day2.entity.Employee;
import com.example.Day2.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long > {

}
