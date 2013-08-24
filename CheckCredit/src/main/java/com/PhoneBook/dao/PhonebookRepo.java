package com.PhoneBook.dao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 16/08/13
 * Time: 8:48 AM
 * To change this template use File | Settings | File Templates.
 */
public interface PhonebookRepo {
    void insertRecord(Person person);
    List<Person>  getRecord(String name, String surname);

}

