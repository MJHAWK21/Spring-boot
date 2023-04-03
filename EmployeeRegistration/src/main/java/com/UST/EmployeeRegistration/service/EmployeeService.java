/**
 * 
 */
package com.UST.EmployeeRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.EmployeeRegistration.model.Employee;
import com.UST.EmployeeRegistration.repository.EmployeeRepo;

/**
 * @author Administrator
 *
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeerepo;

	public Employee createEmployee(Employee employee) {
	      return employeerepo.save(employee);
	}

	public List<Employee> getEmployees() {
		
		return employeerepo.findAll();
	}

	public Employee getEmployeeById(int id) {
	
		return employeerepo.findById(id).orElse(null);
	}

	public Employee updateEmployee(Employee employee) {
		Employee oldemp=null;
		Optional<Employee>optionalemployee=employeerepo.findById(employee.getId());
		if(optionalemployee.isPresent()) {
			oldemp=optionalemployee.get();
			oldemp.setEmpname(employee.getEmpname());
			oldemp.setAddress(employee.getAddress());
			oldemp.setLocation(employee.getLocation());
			employeerepo.save(oldemp);
		}else {
			return new Employee();
		}
		return oldemp;
	}

	public String deleteEmployeeById(int id) {
		employeerepo.deleteById(id);
		return "The employee information is deleted" ;
	}

}
