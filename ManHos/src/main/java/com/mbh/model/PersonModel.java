package com.mbh.model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 11/04/13
 * Time: 8:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class PersonModel {

    private int id;
    private String name;
    private String surname;
    private int number;

    @Id
    @Column (i)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
