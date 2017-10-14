/**
 * 
 */
package com.hp.springdatarest.employee.repo;

import org.springframework.data.repository.CrudRepository;

import com.hp.springdatarest.employee.entities.Employee;

/**
 * @author hpatil
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
