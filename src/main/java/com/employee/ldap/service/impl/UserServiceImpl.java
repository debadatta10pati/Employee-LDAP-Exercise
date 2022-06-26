package com.employee.ldap.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.ldap.dao.EmployeeDao;
import com.employee.ldap.dto.EmployeeDto;
import com.employee.ldap.model.Employee;
import com.employee.ldap.service.UserService;

@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<EmployeeDto> findAll() {
        List<EmployeeDto> employees = new ArrayList<>();
        employeeDao.findAll().iterator().forEachRemaining(employee -> employees.add(employee.copyValuesFromEntitytoDto()));
        return employees;
    }

    @Override
    public Employee findOne(long id) {
        return employeeDao.findById(id).get();
    }

}
