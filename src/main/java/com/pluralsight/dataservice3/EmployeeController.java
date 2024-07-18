package com.pluralsight.dataservice3;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService _employeeService;
	
	@RequestMapping(value =  "/employee/{cid}/employeedetails", method = RequestMethod.GET)
	public Employee getEmployeeDetails(@PathVariable(value = "cid") Long employeeId) {
		
		Optional<Employee> emp = _employeeService.findById(employeeId);
		
		return emp.get();
		
	}
	

}
