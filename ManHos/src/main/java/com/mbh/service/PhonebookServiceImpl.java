package com.mbh.service;

import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 11/04/13
 * Time: 8:09 AM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public class PhonebookServiceImpl implements PhonebookService {
    @Autowired
    private Person person;
    @WebMethod
    public void insertPhoneNumber(Person person) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @WebMethod
    public Person searchPhoneByName(String name) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @WebMethod
    public Person searchPhoneBySurname(String name) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
