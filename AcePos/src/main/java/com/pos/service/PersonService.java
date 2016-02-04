/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.service;

import com.pos.model.persons.Person;
import java.util.List;

/**
 *
 * @author Arif
 */
public interface PersonService {
    public Person saveOrUpdatePerson(Person person);
    public Person getPersonById(int personId);
    public List<Person> getPersons(Person person);
}
