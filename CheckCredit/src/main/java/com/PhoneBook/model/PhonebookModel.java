package com.PhoneBook.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Mani
 * Date: 16/08/13
 * Time: 8:46 AM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "Phonebook", schema = "", catalog = "test")
@Entity
public class PhonebookModel {
    private int id;
    private String name;
    private String surname;
    private int number;

    @javax.persistence.Column(name = "id", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Column(name = "name", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Column(name = "surname", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    @Basic
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @javax.persistence.Column(name = "number", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhonebookModel that = (PhonebookModel) o;

        if (id != that.id) return false;
        if (number != that.number) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + number;
        return result;
    }
}
