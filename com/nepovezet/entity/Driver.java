package com.nepovezet.entity;

/**
 * Created by N on 12.11.2016.
 */
public class Driver {

    private String name;
    private String surname;
    private int phoneNumber;
    private Car car;
    private int id;

    public Driver(String name, String surname, int phoneNumber, Car car, int id) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.car = car;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
