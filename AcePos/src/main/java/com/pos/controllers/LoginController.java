/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.controllers;

import com.pos.beans.employee.EmployeeBean;
import com.pos.model.employees.Employee;
import java.util.ArrayList;
import java.util.List;
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

    public LoginController() {
        System.out.println("***********************************Controller loaded------------------------------");

    }

    @RequestMapping(value = "main")
    public String main(Model model) {
        System.out.println("***********************************Handler called------------------------------");
        //System.err.println("Employees list retrieved: "+employeeService.getAllEmployees());

        //customerService.getCustomerById(1);
//        Customer cust = new Customer();
//        //cust.setFirstName("Muhammad");
//        List<Customer> list = cust.getCustomers();
//        System.err.println("list of customers = "+list);
        return "main";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        System.err.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return "login";
    }

    @RequestMapping(value = "/postLogin", method = RequestMethod.POST)
    public String postLogin(String username, String password) {
        boolean isCorrect = isCorrectUsernameAndPassword(username, password);
        if (isCorrect) {

            return "redirect:/main";
        } else {
            return "login";
        }
    }

    private boolean isCorrectUsernameAndPassword(String username, String password) {
        return password.equals("123")&&username.equals("user");
    }
}
