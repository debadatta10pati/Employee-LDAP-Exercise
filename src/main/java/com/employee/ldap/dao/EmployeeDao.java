package com.employee.ldap.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.ldap.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long> {
}
