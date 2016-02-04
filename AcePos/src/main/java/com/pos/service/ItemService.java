/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.service;


import com.pos.model.items.Item;
import java.util.List;

/**
 *
 * @author Arif
 */
public interface ItemService {
    public Item getItemById(int id);
    public List<Item> getAllItems();
    public void saveOrUpdateItem(Item employee);
}
