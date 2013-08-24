package com.mbh.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 11/04/13
 * Time: 8:00 AM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface PhonebookService {

    void insertPhoneNumber(Person person);
    Person searchPhoneByName(String name);
    Person searchPhoneBySurname(String name);
}
