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
import com.pos.service.CustomerService;
import com.pos.service.PersonService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerControler {
@Autowired
    private PersonService personService;
@Autowired
    private CustomerService customerService;

   

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
    
    @RequestMapping(value = "/customerAdd", method = RequestMethod.POST)
    public String customerAddPost(@ModelAttribute CustomerBean cbn) {
        System.out.println("Going to add person");
        
        Customer cust = new Customer();
        cust.setReferance(cbn.getReference());
        cust.setTypeOfCustomer(cbn.getTypeOfCustomer());
        
        Person person = new Person();
        person.setFirstName(cbn.getFirstName());
        person.setLastName(cbn.getLastName());
        person.setAge(cbn.getAge());
        person.setEmail(cbn.getEmail());
        person.setMobileNo(cbn.getMobilePhone());
        person.setUserName(cbn.getUserName());
        
        person = personService.saveOrUpdatePerson(person);
        cust.setPersonId(person.getPersonId());
        System.out.println("Going to add customer for personId = "+person.getPersonId());
        
        customerService.saveOrUpdateCustomer(cust);
        return "customerAdd";
    }

    @RequestMapping(value = "customerList", method = RequestMethod.GET)
    public String customerList(Model model) {
        System.err.println("-----------customerList handler called"+customerList1());
        
        //model.addAttribute("customersList", customerList1());
        List<CustomerDto> listDtos = getCstomerDto();
        System.out.println("+++++++++++++++++++++++++++++Size of customers = "+listDtos.size());
        model.addAttribute("customersList", listDtos);
        return "customerList";
    }
    
    
    public List<CustomerDto> getCstomerDto(){
        List<CustomerDto> listDtos = new ArrayList<>();
        List<Customer> listCustomers = customerService.getAllCustomers();
        Person person = null;
        for(Customer cust : listCustomers){
            person = personService.getPersonById(cust.getPersonId());
            listDtos.add(new CustomerDto(person, cust));
        }
        
        return listDtos;
    }
    
    
    
    public void createCustomer(){
        //customerService.getCustomerById(1);
        Person person = new Person();
        person.setFirstName("Michael");
        person.setLastName("Zihestra");
        System.err.println("----------------Going to create Person = "+person);
        person = personService.saveOrUpdatePerson(person);
        System.err.println("++++++++++++++++++++Newly Created Person = "+person);
        Customer cust = new Customer();
        cust.setPersonId(person.getPersonId());
        cust.setReferance("My Referance");
        cust.setTypeOfCustomer("Regular");
        customerService.saveOrUpdateCustomer(cust);
    }
    
    
}
