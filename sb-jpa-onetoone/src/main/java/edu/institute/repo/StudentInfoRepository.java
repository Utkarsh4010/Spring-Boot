package edu.institute.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.StudentInfo;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo, Integer> {

}
