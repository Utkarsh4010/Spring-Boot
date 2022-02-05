package edu.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.institute.entity.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

}
