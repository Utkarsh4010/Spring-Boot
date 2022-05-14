package com.example.springbootbackend.repository;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.example.springbootbackend.model.Employee;
//
//
//@Repository
//public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//	
//	 @Autowired
//
//	private JdbcTemplate temp;
//    public static int saveEmployee(Employee employees) {
//  	  int count=temp.update("insert into empolyees values(0,?,?,?)",employees.getFirstName(),employees.getLastName(),employees.getEmailId());
//  	  Object data[] = {employees.getFirstName(),employees.getLastName(), employees.getEmailId()  };
//  	  int count=temp.update("insert into employees values(0,?,?,?)",data);
//  	  return count;
//    }
//}

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
 
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.example.springbootbackend.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //  @Autowired
     // private JdbcTemplate temp;
      
//      public int saveEmployee(Employee emp) {
//    	  int count=temp.update("insert into empolyees values(0,?,?,?)",emp.getFirstName(),emp.getLastName(),emp.getEmailId());
//    	  Object data[] = {emp.getFirstName(),emp.getLastName(), emp.getEmailId()  };
//    	 // int count =temp.update("insert into employee values(0,?,?,?)",data);
//    	  return count;
//    
//      }
      
//      public List<Employee>getAll(){
//    	  String query ="select * from employees";
//    	  //EmployeeRowExtractor extractor=new EmployeeExtractor();
//    	  //return temp.query(query,extractor);
//    	  return temp.query(query, new BeanPropertyRowMapper(Employee.class));
//      }
      
//      public int deleteEmployee(int id) {
//    	  String query="delete from employees where id=?";
//    	  int count=temp.update(query,id);
//    	  return count;
//      } 
//      
//      public int updateEmployee(Employee emp) {
//    	  String query ="update employees set name=?, set email=? set password=?where id=?";
//    	  Object data[] = { emp.getFirstName(),emp.getLastName(), emp.getEmailId(), emp.getId() };
//    	  int count=temp.update(query,data);
//    	  return count;
//      }
//       
}
