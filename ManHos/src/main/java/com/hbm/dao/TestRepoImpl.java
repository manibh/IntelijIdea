package com.hbm.dao;

import com.hbm.model.TestEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 6/04/13
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class TestRepoImpl   implements TestRepo{


    @Autowired
    private SessionFactory sessionFactory;

//    public TestRepo(TestEntity testDao){
//        this.testDao=testDao;
//    }
    public void insert(TestEntity testEnt){


        Session session= sessionFactory.openSession();
        Transaction trx = session.beginTransaction();
        session.save(testEnt);
        trx.commit();
        System.out.println("id: " + testEnt.getId());

        session.close();

    }
}
