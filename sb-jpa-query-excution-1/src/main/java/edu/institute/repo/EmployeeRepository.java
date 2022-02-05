package edu.institute.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.institute.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public List<Employee> findByCity(String city);

}
