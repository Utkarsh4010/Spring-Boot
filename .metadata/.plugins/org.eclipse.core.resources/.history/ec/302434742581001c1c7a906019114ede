package edu.institute.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.institute.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository {
 
	// @Query("from Course where title=?2 and fees=/1")  //param query
	// @Query("from Course where title=;t and fees=:f")   // named param query
	 @Query(nativeQuery=true, value="select * course_details where coursetitle=:t and fees f=:f") //named param query
	 public List<Course>getCourseByName(@Param("f") double fees, @Param("t") String name);
}
