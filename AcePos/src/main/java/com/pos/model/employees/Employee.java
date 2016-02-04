/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.employees;

import com.pos.model.customers.Customer;
import com.pos.model.persons.Person;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Arif Usman
 */
@Entity(name="Employees")
public class Employee implements Serializable{
    public static String EMPLOYEEID="EMPLOYEEID";
    public static String PERSONID="PERSONID";
    public static String DESIGNATION="DESIGNATION";
    public static String USERNAME="USERNAME";
    public static String PASSWORD="PASSWORD";

    @Id
    @GeneratedValue
    @Column(name="employeeid")
    private int employeeId;
    @Column(name="personid")
    private int personID;
    @Column(name="designation")
    private String designation;
    

//    public List<Employee> getEmployees(SessionFactory factory) {
//        List<Employee> list = null;
//        if (factory == null) {
//            System.out.println("Session factory not populated properly");
//            return null;
//        } else {
//            System.out.println("Session factory not populated successfully");
//            list = factory.getCurrentSession().createQuery(" from Employees").list();
//        }
//        
//        return list;
//    }
    
//    /**
//     * Gets customer based on the employeeId
//     * 
//     * @return Null if not found otherwise employee against employeeId
//     */
//    public Employee getEmployeeById(int employeeId, SessionFactory factory) {
//        Employee employee = null;
//        if (factory == null) {
//            System.out.println("Session factory not populated properly");
//            return null;
//        } else {
//            System.out.println("Session factory not populated successfully");
//            List<Employee> list = factory.getCurrentSession().createQuery(" from Employees e where Employees.employeeid="+employeeId).list();
//            if(!list.isEmpty())
//                employee = list.get(0);
//        }
//        
//        return employee;
//    }
    
    /**
     * Saves an object and returns newly created employee object
     * @param emp Object to be saved
     * @return Newly created employee object
     */
//    public Employee saveOrUpdateEmployee(Employee emp, SessionFactory factory){
//        Employee employee = null;
//        if (factory == null) {
//            System.out.println("Session factory not populated properly");
//            
//        } else {
//            System.out.println("Session factory not populated successfully");
//            factory.getCurrentSession().saveOrUpdate(emp);
//        }
//        
//        return employee;
//    }
    
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeID=" + employeeId + "personID=" + personID + "designation=" + designation + '}';
    }
 
}
