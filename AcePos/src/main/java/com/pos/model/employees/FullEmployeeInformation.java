/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.employees;

import com.pos.model.persons.Person;

/**
 *
 * @author Arif Usman
 */
public class FullEmployeeInformation {
    private Person person;
    private Employee employee;

    public FullEmployeeInformation() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "FullEmployeeInformation{" + "person=" + person.toString() + "employee=" + employee.toString() + '}';
    }
    

}
