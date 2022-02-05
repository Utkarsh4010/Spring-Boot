package edu.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.Answer;

@Repository
public interface AnswerRepo extends JpaRepository<Answer, Integer> {

}
