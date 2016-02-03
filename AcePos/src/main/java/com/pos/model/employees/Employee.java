/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.employees;

import com.pos.model.customers.Customer;
import com.pos.model.persons.Person;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Arif Usman
 */
@Entity(name="Employees")
public class Employee extends Person implements Serializable{
    public static String EMPLOYEEID="EMPLOYEEID";
    public static String PERSONID="PERSONID";
    public static String DESIGNATION="DESIGNATION";
    public static String USERNAME="USERNAME";
    public static String PASSWORD="PASSWORD";

    private int employeeID;
    private int personID;
    private String designation;

    public List<Employee> getEmployees() {
        List<Employee> list = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");
            return null;
        } else {
            System.out.println("Session factory not populated successfully");
            list = factory.getCurrentSession().createQuery("* from Employees").list();
        }
        
        return list;
    }
    
    /**
     * Gets customer based on the employeeId
     * 
     * @return Null if not found otherwise employee against employeeId
     */
    public Employee getEmployeeById(int employeeId) {
        Employee employee = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");
            return null;
        } else {
            System.out.println("Session factory not populated successfully");
            List<Employee> list = factory.getCurrentSession().createQuery("* from Employees where Employees.employeeId="+employeeId).list();
            if(!list.isEmpty())
                employee = list.get(0);
        }
        
        return employee;
    }
    
    /**
     * Saves an object and returns newly created employee object
     * @param emp Object to be saved
     * @return Newly created employee object
     */
    public Employee saveEmployee(Employee emp){
        Employee employee = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");
            
        } else {
            System.out.println("Session factory not populated successfully");
            Object employeeObject = factory.getCurrentSession().save(emp);
            if(employeeObject!=null)
                employee = (Employee)employeeObject;
        }
        
        return employee;
    }
    
    public SessionFactory getFactory() {
        return factory;
    }

    @Autowired
    public void setFactory(SessionFactory factory) {
        System.err.println("Setting session factory to "+factory);
        this.factory = factory;
    }
    
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
