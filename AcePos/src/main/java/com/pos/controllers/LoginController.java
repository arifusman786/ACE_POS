/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.controllers;

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
