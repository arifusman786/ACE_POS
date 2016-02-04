/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pos.model.persons;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Arif
 */
@Entity(name="Persons") @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person implements Serializable {
    public static String PERSONID="PERSONID";
    public static String FIRSTNAME="FIRSTNAME";
    public static String LASTNAME="LASTNAME";
    public static String AGE="AGE";
    public static String EMAIL="EMAIL";
    public static String SEX="SEX";
    public static String PHONENO="PHONENO";
    public static String MOBILENO="MOBILENO";
    public static String ADDRESS="ADDRESS";
     
     

    @Id
    @GeneratedValue
    @Column(name="personid")
    private int personId;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="age")
    private int age;
    @Column(name="email")
    private String email;
    @Column(name="username")
    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="sex")
    private String sex;
    @Column(name="phoneno")
    private String phoneNo;
    @Column(name="mobileno")
    private String mobileNo;
    @Column(name="address")
    private String address;

    public Person() {
        System.err.println("Person's constructor");
    
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Person{" + "personId=" + personId + "firstName=" + firstName + "lastName=" + lastName + "age=" + age + "email=" + email + "userName=" + userName + "password=" + password + "sex=" + sex + "phoneNo=" + phoneNo + "mobileNo=" + mobileNo + "address=" + address + '}';
    }

    public static String getCommaSeparatedStrOfPersonsColumnsForUpdateQuery(){
        String tempStr = FIRSTNAME+"=?, "+LASTNAME+"=?, "+AGE+"=?, "+EMAIL+"=?, "+
               SEX+"=?, "+PHONENO+"=?, "+
                MOBILENO+"=?, "+ADDRESS+"=?";
        
        return tempStr;
    }
}
