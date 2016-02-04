/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.controllers;

import com.pos.beans.employee.EmployeeBean;
import com.pos.beans.customer.CustomerBean;
import javax.validation.Valid;
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

    @RequestMapping(value = "/employeeAdd", method = RequestMethod.GET)
    public String employeeAdd(@ModelAttribute EmployeeBean emp) {
        return "employeeAdd";
    }

    @RequestMapping(value = "employeeList", method = RequestMethod.GET)
    public String employeeList(Model model) {
        return "employeeList";
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
