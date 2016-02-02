/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.employees;

/**
 *
 * @author Arif Usman
 */
public class Employee {
    public static String EMPLOYEEID="EMPLOYEEID";
    public static String PERSONID="PERSONID";
    public static String DESIGNATION="DESIGNATION";
    public static String USERNAME="USERNAME";
    public static String PASSWORD="PASSWORD";
    

    private int employeeID;
    private int personID;
    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeID=" + employeeID + "personID=" + personID + "designation=" + designation + '}';
    }
 
}
