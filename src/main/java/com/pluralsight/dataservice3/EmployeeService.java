package com.pluralsight.dataservice3;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository _employeeRepository;
	
	public Optional<Employee> findById(Long employeeId) {
		
		return _employeeRepository.findById(employeeId);
	}

}
