/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.controllers;

import com.pos.beans.employee.EmployeeBean;
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

    @RequestMapping(value = "/employeeadd", method = RequestMethod.GET)
    public String addBook(@ModelAttribute EmployeeBean emp) {
        return "employeeadd";
    }

    @RequestMapping(value = "employeeList")
    public String login(Model model) {
        return "employeeList";
    }
    
    @RequestMapping(value = "employeeadd")
    public String employee(Model model) {
        return "employeeadd";
    }
}
