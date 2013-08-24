package com.hbm.service;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 29/03/13
 * Time: 10:35 AM
 * To change this template use File | Settings | File Templates.
 */

import javax.jws.WebService;

@WebService
public interface MyWebService {
    boolean isEven(Integer inputNumber);

}
