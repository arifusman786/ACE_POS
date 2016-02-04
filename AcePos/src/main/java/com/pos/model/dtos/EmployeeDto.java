/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.model.dtos;

import com.pos.model.employees.Employee;
import com.pos.model.persons.Person;

/**
 *
 * @author Arif
 */
public class EmployeeDto {
    private Person person;
    private Employee employee;

    public EmployeeDto(Person person, Employee employee) {
        this.person = person;
        this.employee = employee;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" + "person=" + person + ", employee=" + employee + '}';
    }
    
}
