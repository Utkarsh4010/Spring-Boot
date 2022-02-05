package edu.institute.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.StudentEducation;

@Repository
public interface StudentEducationRepository extends JpaRepository<StudentEducation, Integer> {

}
