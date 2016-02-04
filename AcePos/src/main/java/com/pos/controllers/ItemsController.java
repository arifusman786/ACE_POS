/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.controllers;

import com.pos.beans.items.AddItemBean;
import com.pos.model.dtos.CustomerDto;
import com.pos.model.items.Item;
import com.pos.service.CustomerService;
import com.pos.service.ItemService;
import com.pos.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Arif
 */
@Controller
public class ItemsController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "itemUpdate")
    public String itemUpdate(Model model) {
        return "itemUpdate";
    }

    @RequestMapping(value = "/itemAdd", method = RequestMethod.GET)
    public String itemAddGet(@ModelAttribute AddItemBean itemBean) {
        return "itemAdd";
    }

    @RequestMapping(value = "/itemAdd", method = RequestMethod.POST)
    public String itemAddPost(@ModelAttribute AddItemBean itemBean) {
        System.err.println("going to add item " + itemBean);
        Item item = new Item();
        item.setCategory(itemBean.getCategory());
        item.setItemName(itemBean.getItemName());
        item.setMade(itemBean.getMade());
        item.setMeasuremetUnit(itemBean.getMeasurementUnit());
        //item.setUnitDiscount(itemBean.getUnitDiscount());
        item.setUnitGrassPrice(itemBean.getUnitGrassPrice());
        item.setUnitGst(itemBean.getUnitGst());
        item.setUnitInterest(itemBean.getUnitInterest());

        itemService.saveOrUpdateItem(item);

        System.err.println("Redirecting to list items");
        return "redirect:/itemList";
    }

    //itemList
    @RequestMapping(value = "itemList", method = RequestMethod.GET)
    public String itemList(Model model) {
        System.err.println("-----------itemList handler called");

        //model.addAttribute("customersList", customerList1());
        List<Item> listItems = itemService.getAllItems();
        System.out.println("+++++++++++++++++++++++++++++Size of customers = " + listItems.size());
        model.addAttribute("itemsList", listItems);
        return "itemList";
    }

    @RequestMapping(value = "/itemEdit", method = RequestMethod.GET)
    public String itemEdit(@ModelAttribute AddItemBean itemBean, Model model) {
        List<Item> listItems = itemService.getAllItems();
        System.out.println("+++++++++++++++++++++++++++++Size of customers = " + listItems.size());
        model.addAttribute("itemsList", listItems);

        return "itemEdit";
    }

    @RequestMapping(value = "/updateItemBean")
    public String updateItemBean(@ModelAttribute AddItemBean itemBean, Model model) {
        System.err.println("Updating item bean");
        List<Item> listItems = itemService.getAllItems();
        Item item = itemService.getItemById(itemBean.getSelectedItem().getItemCode());
        itemBean.setItemName(item.getItemName());
        itemBean.setMade(item.getMade());
        itemBean.setWeight(item.getWeight());
        System.out.println("+++++++++++++++++++++++++++++Size of customers = " + listItems.size());
        model.addAttribute("itemsList", listItems);

        return "itemEdit";
    }
}
