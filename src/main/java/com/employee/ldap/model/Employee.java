package com.employee.ldap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.employee.ldap.dto.EmployeeDto;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "USERNAME")
    private String username;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

  public EmployeeDto copyValuesFromEntitytoDto(){
    	EmployeeDto employeeDto = new EmployeeDto();
    	employeeDto.setId(this.id);
    	employeeDto.setFirstName(this.firstName);
    	employeeDto.setLastName(this.lastName);
    	employeeDto.setUsername(this.username);

        return employeeDto;
    }
}
