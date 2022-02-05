package edu.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
