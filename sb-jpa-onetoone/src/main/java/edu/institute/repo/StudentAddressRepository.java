package edu.institute.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.StudentAddress;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress, Integer> {

}
