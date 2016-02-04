/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.service.impl;

import com.pos.model.customers.HibernateUtil;
import com.pos.model.employees.Employee;
import com.pos.service.EmployeeService;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Arif
 */
public class EmployeeServiceImpl implements EmployeeService{
    private final SessionFactory factory;

    public EmployeeServiceImpl() {
        factory = HibernateUtil.getSessionFactory();
    }
    
    @Override
    public Employee getEmployeeById(int employeeId) {
        Employee employee = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");
            return null;
        } else {
            System.out.println("Session factory not populated successfully");
            List<Employee> list = factory.getCurrentSession().createQuery(" from Employees e where e.employeeid="+employeeId).list();
            if(!list.isEmpty())
                employee = list.get(0);
        }
        
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");
            return null;
        } else {
            factory.getCurrentSession().beginTransaction();
            System.out.println("Session factory not populated successfully");
            list = factory.getCurrentSession().createQuery(" from Employees").list();
            factory.getCurrentSession().close();
        }
        
        return list;
    }

    @Override
    public void saveOrUpdateEmployee(Employee employee) {
        Transaction tx = factory.getCurrentSession().beginTransaction();
        factory.getCurrentSession().saveOrUpdate(employee);
        tx.commit();
        factory.getCurrentSession().close();
    }
    
}
