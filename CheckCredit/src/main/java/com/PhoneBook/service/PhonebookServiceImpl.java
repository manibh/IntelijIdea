package com.PhoneBook.service;

import com.PhoneBook.dao.Person;
import com.PhoneBook.dao.PhonebookRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 16/08/13
 * Time: 5:08 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
@WebService (endpointInterface = "com.PhoneBook.service.PhonebookService")
public class PhonebookServiceImpl implements PhonebookService {

    @Autowired
    private PhonebookRepoImpl phonebookRepo;

    @WebMethod
    public void insertRecord(Person person) {
        //To change body of implemented methods use File | Settings | File Templates.
        phonebookRepo.insertRecord(person);
        System.out.println("record inserted at service level");
    }

    @WebMethod
    public List<Person> searchRecords(String name, String surname) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
