package com.PhoneBook.service;

import com.PhoneBook.dao.Person;

import javax.jws.WebService;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 16/08/13
 * Time: 5:08 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface PhonebookService {
    void insertRecord(Person person);
    List<Person> searchRecords(String name, String surname);
}
