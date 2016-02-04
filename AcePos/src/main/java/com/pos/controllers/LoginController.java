/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.controllers;

import com.pos.service.CustomerService;
import com.pos.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Arif
 */
@Controller
public class LoginController {

    @Autowired
    private CustomerService customerService;
    
    @Autowired
    private EmployeeService employeeService;
    
    public LoginController() {
        System.out.println("***********************************Controller loaded------------------------------");

    }

    @RequestMapping(value = "main")
    public String main(Model model) {
        System.out.println("***********************************Handler called------------------------------");
        System.err.println("Employees list retrieved: "+employeeService.getAllEmployees());
        
        //customerService.getCustomerById(1);
//        Customer cust = new Customer();
//        //cust.setFirstName("Muhammad");
//        List<Customer> list = cust.getCustomers();
//        System.err.println("list of customers = "+list);
        return "main";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

}
