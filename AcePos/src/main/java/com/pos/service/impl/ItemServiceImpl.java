/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.service.impl;

import com.pos.model.customers.Customer;
import com.pos.model.customers.HibernateUtil;
import com.pos.model.items.Item;
import com.pos.service.ItemService;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Arif
 */
public class ItemServiceImpl implements ItemService{
    
    private final SessionFactory factory;

    public ItemServiceImpl() {
        factory = HibernateUtil.getSessionFactory();
    }
    
    @Override
    public Item getItemById(int id) {
        Item item = null;
        if (factory == null) {
            System.out.println("Session factory not populated properly");
            return null;
        } else {
            System.out.println("Session factory not populated successfully");
            factory.getCurrentSession().beginTransaction();
            List<Item> list = factory.getCurrentSession().createQuery(" from Items i where i.itemId="+id).list();
            if(!list.isEmpty())
                item = list.get(0);
            factory.getCurrentSession().close();
        }
        
        return item;
    }

    @Override
    public List<Item> getAllItems() {
        //Items.ALL
        
        List<Item> list = null;
        System.out.println("Session factory populated successfully");
        factory.getCurrentSession().beginTransaction();
        Query query = factory.getCurrentSession().getNamedQuery("Items.ALL");
        
        list = query.list();
        factory.getCurrentSession().close();
//      
        return list;
    }

    @Override
    public void saveOrUpdateItem(Item item) {
        System.out.println("Session factory not populated successfully");
        Transaction tx = factory.getCurrentSession().beginTransaction();
        factory.getCurrentSession().merge(item);
        tx.commit();
        factory.getCurrentSession().close();
    }
    
}
