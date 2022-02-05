package edu.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.institute.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {  // Student is class name and integer is primary key data type

}
