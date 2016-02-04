/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.controllers;

import com.pos.beans.customer.CustomerBean;
import com.pos.model.customers.Customer;
import com.pos.model.dtos.CustomerDto;
import com.pos.model.persons.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerControler {

   

    public List<CustomerDto> customerList1() {
         List<CustomerDto> list = new ArrayList<>();
        Person per = new Person();
        per.setFirstName("Nick");
        per.setLastName("Nova");
        per.setPersonId(0);
        Customer cust = new Customer();
        cust.setCustomerId(0);
        cust.setPersonId(per.getPersonId());
        CustomerDto dt = new CustomerDto(per, cust);
        list.add(dt);
        return list;
    }
    

    @RequestMapping(value = "customerUpdate")
    public String customerUpdate(Model model) {
        return "customerUpdate";
    }

    @RequestMapping(value = "/customerAdd", method = RequestMethod.GET)
    public String customerAdd(@ModelAttribute CustomerBean cbn) {
        return "customerAdd";
    }

    @RequestMapping(value = "customerList", method = RequestMethod.GET)
    public String customerList(Model model) {
        System.err.println("-----------customerList handler called"+customerList1());
        
        model.addAttribute("customersList", customerList1());
        return "customerList";
    }
 
}
