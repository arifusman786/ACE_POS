/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.service.impl;

import com.pos.model.customers.HibernateUtil;
import com.pos.model.persons.Person;
import com.pos.service.PersonService;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Arif
 */
public class PersonServiceImpl implements PersonService{
    private final SessionFactory factory;   

    public PersonServiceImpl() {
        factory = HibernateUtil.getSessionFactory();
    }
    
    @Override
    public Person getPersonById(int personId) {
        Person person = null;
        try {
            System.out.println("***********************************Service's Handler called------------------------------");
            //factory.getCurrentSession().beginTransaction();
            factory.getCurrentSession().beginTransaction();
            //Customer cust = new Customer();
            //cust.setFirstName("Muhammad");
            System.out.println("Session factory populated successfully so retrieving customer by id " + personId);
            List<Person> list = factory.getCurrentSession().createQuery(" from Persons as p where p.personId=" + personId).list();

            if (!list.isEmpty()) {
                person = list.get(0);
            }
            System.err.println("Person retrieved = " + person);
            factory.getCurrentSession().close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return person;
    }

    @Override
    public List<Person> getPersons(Person person) {
        List<Person> list = null;
        System.out.println("Session factory populated successfully");
        factory.getCurrentSession().beginTransaction();
        list = factory.getCurrentSession().createQuery(" from Persons ").list();
        factory.getCurrentSession().close();
//      
        return list;
    }

    @Override
    public Person saveOrUpdatePerson(Person person) {
        System.out.println("Session factory not populated successfully");
        Transaction tx = factory.getCurrentSession().beginTransaction();
        person = (Person)factory.getCurrentSession().merge(person);
        tx.commit();
        factory.getCurrentSession().close();
        return person;
    }
    
}
