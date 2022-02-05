package eduinstitute.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
 
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import eduinstitute.bean.Employee;

@Repository
public class EmployeeRepository {
      @Autowired
      private JdbcTemplate temp;
      
      public int saveEmployee(Employee emp) {
    	  //int count=temp.update("insert into empolyee values(0,?,?,?)",emp.getName(),emp.getEmail(),emp.getPassword());
    	  Object data[] = {emp.getName(),emp.getEmail(), emp.getPasssword()  };
    	  int count=temp.update("insert into employee values(0,?,?,?)",data);
    	  return count;
    
      }
      
      public List<Employee>getAll(){
    	  String query ="select * from employee";
    	  //EmployeeRowExtractor extractor=new EmployeeExtractor();
    	  //return temp.query(query,extractor);
    	  return temp.query(query, new BeanPropertyRowMapper(Employee.class));
      }
      
      public int deleteEmployee(int id) {
    	  String query="delete from employee where id=?";
    	  int count=temp.update(query,id);
    	  return count;
      } 
      
      public int updateEmployee(Employee emp) {
    	  String query ="update employee set name=?, set email=? set password=?where id=?";
    	  Object data[] = { emp.getName(),emp.getEmail(), emp.getPasssword(), emp.getId() };
    	  int count=temp.update(query,data);
    	  return count;
      }
       
}


  class EmployeeRowExtractor implements ResultSetExtractor<List<Employee>>{
	  @Override
	  public List<Employee>extractData(ResultSet rs) throws SQLException, DataAccessException{
		List<Employee>empList=new ArrayList<Employee>();
		while(rs.next()) {
			Employee emp= new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setEmail(rs.getString("email"));
			emp.setPasssword(rs.getString("password"));
			empList.add(emp);
			
		}
		return empList;
	  }
  }























