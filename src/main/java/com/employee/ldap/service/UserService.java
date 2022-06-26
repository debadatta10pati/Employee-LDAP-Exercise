package com.employee.ldap.service;

import java.util.List;

import com.employee.ldap.dto.EmployeeDto;
import com.employee.ldap.model.Employee;

public interface UserService {

    List<EmployeeDto> findAll();
    Employee findOne(long id);
}
