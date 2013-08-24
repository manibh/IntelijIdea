package com.PhoneBook.dao;

import com.PhoneBook.model.PhonebookModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 16/08/13
 * Time: 8:49 AM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class PhonebookRepoImpl implements PhonebookRepo {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void insertRecord(Person person) {
        //To change body of implemented methods use File | Settings | File Templates.
        Session session= this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        PhonebookModel phonebookModel= new PhonebookModel();
        phonebookModel.setName(person.getName());
        phonebookModel.setSurname(person.getSurname());
        phonebookModel.setNumber(person.getNumber());
        session.save(phonebookModel);
        tx.commit();
        session.close();
        System.out.println("Phonebook updated with "+ person.toString());

    }

    @Override
    public List<Person> getRecord(String name, String surname) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
