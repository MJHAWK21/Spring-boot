/**
 * 
 */
package com.UST.EmployeeRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UST.EmployeeRegistration.model.Employee;

/**
 * @author Administrator
 *
 */

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
