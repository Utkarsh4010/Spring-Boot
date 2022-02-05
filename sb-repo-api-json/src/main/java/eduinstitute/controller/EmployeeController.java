package eduinstitute.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eduinstitute.bean.Employee;

@RestController
public class EmployeeController {
      
	List<Employee>list=new ArrayList<Employee>();
	
	//Save the employee details
	@PostMapping("/employee/save")
	public String saveEmployee(@RequestBody Employee employee) {
		  list.add(employee);
		  return "Employee Created Successfully....";
	}
	 
	//return the list of employee
	@GetMapping("/employee/get-all")
	public List<Employee>getAll(){
		return list;
	}
	
	//delete the employee by Id
	@DeleteMapping("/employee/delete/{empid}")
	public String deleteEmployee(@PathVariable("empid") int id) {
		Iterator<Employee>it=list.iterator();
		while(it.hasNext()) {
			if(id==it.next().getId()) {
				it.remove();
				break;
			}
		}
		return "Employee Deleted Succcessfully";
	}
	
	//get Employee by id
	@GetMapping("/employee/get-by-id")
	public Employee getId(@RequestParam("id")int id) {
		System.out.println("id :" +id);
		Employee empData=null;
		for(Employee emp:list) {
			if(id==emp.getId()) {
				empData=emp;
			}
		}
		return empData;
	}
}


















