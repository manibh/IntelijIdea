package com.hbm.service;

import com.hbm.dao.TestRepo;
import com.hbm.model.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 29/03/13
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 */

@Service
//@WebService(endpointInterface = "com.hbm.service.MyWebService", wsdlLocation = "/WEB-INF/classes/interface/MyWebServiceImpl.wsdl")
@WebService(endpointInterface = "com.hbm.service.MyWebService")
public class MyWebServiceImpl implements MyWebService{

    @Autowired
    private TestRepo testRepo;
    public MyWebServiceImpl(){

    }

    @WebMethod
    public boolean isEven(Integer inputNumber)
    {
        if(inputNumber%2 == 0 ){
//            int number=0;
            TestEntity ent=new TestEntity();
            ent.setValue(inputNumber.toString());
            testRepo.insert(ent);
            return true;
        }
        else {
            TestEntity ent=new TestEntity();
            ent.setValue(inputNumber.toString());
            testRepo.insert(ent);
            return false;
        }

    }

    /*
    public static void main(String[] args) {
        Object implementor= new MyWebServiceImpl();
        String address="http://localhost:8080/service";
        Endpoint.publish(address,implementor);
    }
    */
}
