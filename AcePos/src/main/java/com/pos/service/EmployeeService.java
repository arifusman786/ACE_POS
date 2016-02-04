/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.service;

import com.pos.model.employees.Employee;
import java.util.List;

/**
 *
 * @author Arif
 */
public interface EmployeeService {
    public Employee getEmployeeById(int id);
    public List<Employee> getAllEmployees();
    public void saveOrUpdateEmployee(Employee employee);
}
