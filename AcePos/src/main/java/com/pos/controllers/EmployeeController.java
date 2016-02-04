/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.controllers;

import com.pos.beans.employee.EmployeeBean;
import com.pos.model.dtos.EmployeeDto;
import com.pos.model.employees.Employee;
import com.pos.model.persons.Person;
import com.pos.service.EmployeeService;
import com.pos.service.PersonService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author nizomiddin
 */
@Controller
public class EmployeeController {
    @Autowired
    private PersonService personService;
    @Autowired
    private EmployeeService employeeService;

    public List<EmployeeDto> employeeList1() {
        List<EmployeeDto> list = new ArrayList<>();
        Person per = new Person();
        per.setFirstName("Nick");
        per.setLastName("Nova");
        per.setPersonId(0);
        Employee emp = new Employee();
        emp.setPersonID(0);
        emp.setEmployeeId(0);
        EmployeeDto dt = new EmployeeDto(per, emp);
        list.add(dt);
        return list;
    }

    @RequestMapping(value = "employeeList", method = RequestMethod.GET)
    public String employeeList(Model model) {
        System.err.println("-----------employee List handler called");

        model.addAttribute("employeeList", getEmployeeDto());
        return "employeeList";
    }
    
    public List<EmployeeDto> getEmployeeDto(){
        List<EmployeeDto> listDtos = new ArrayList<>();
        List<Employee> listEmployees = employeeService.getAllEmployees();
        Person person = null;
        for(Employee emp : listEmployees){
            person = personService.getPersonById(emp.getPersonID());
            listDtos.add(new EmployeeDto(person, emp));
        }
        
        return listDtos;
    }
    
    public void createEmployee(){
        //customerService.getCustomerById(1);
        Person person = new Person();
        person.setFirstName("Najam");
        person.setLastName("Shethy");
        System.err.println("----------------Going to create Person = "+person);
        person = personService.saveOrUpdatePerson(person);
        System.err.println("++++++++++++++++++++Newly Created Person = "+person);
        Employee emp = new Employee();
        emp.setPersonID(person.getPersonId());
        emp.setDesignation("My Designation");
        
        employeeService.saveOrUpdateEmployee(emp);
    }

    @RequestMapping(value = "/employeeAdd", method = RequestMethod.GET)
    public String employeeAdd(@ModelAttribute EmployeeBean emp) {
        return "employeeAdd";
    }



    @RequestMapping(value = "success")
    public String success(Model model) {
        return "success";
    }

    @RequestMapping(value = "employeeUpdate")
    public String employeeUpdate(Model model) {
        return "employeeUpdate";
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public String add(@Valid EmployeeBean emp, BindingResult result) {
        System.err.println("this is ******************" + result);
        if (result.hasErrors()) {
            System.err.println("this is -------------------");
            return "employeeAdd";
        } else {
            return "redirect:/employees";
        }
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String getAll(Model model) {
        return "employeeList";
    }
}
