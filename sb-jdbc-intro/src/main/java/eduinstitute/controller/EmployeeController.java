package eduinstitute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eduinstitute.bean.Employee;
import eduinstitute.repository.EmployeeRepository;

@RestController
public class EmployeeController {
      
	@Autowired
	private EmployeeRepository empRepo;
	
	@PostMapping("/employee/save")
	public String saveEmp(@RequestBody Employee emp) {
		int result=empRepo.saveEmployee(emp);
		if(result>0) {
			return "Employee Created Successfully....";
		} else {
			return "Error in Employee Creation";
		}
	}
	
	@GetMapping("/employee/get-all")
	public List<Employee>getAllEmployee(){
		return empRepo.getAll();
	}
	
	@DeleteMapping("/empolyee/delete/{id}")
	public String deleteEmp(@PathVariable int id) {
		int result = empRepo.deleteEmployee(id);
		return result>0?"Employee Deleted Successfully"
				:"Error in Employee Deletion";
	}
	
	@PutMapping("/employee/update")
	public String updateEmp(@RequestBody Employee emp) {
		int result=empRepo.updateEmployee(emp);
		return result>0?"Employee Updated Successfully"
				:"Error in Employee Updation";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
