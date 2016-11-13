package com.nepovezet.entity;

/**
 * Created by N on 11.11.2016.
 */
public class Car {

    private String carNumber;
    private String carMark;
    private int carClass;
    private String status;
    private boolean isHaveBabySeat;
    private boolean isHaveSmoke;

    public static final int CLASS_ECONOMIC = 0;
    public static final int CLASS_BUSYNESS = 1;
    public static final String STATUS_FREE = "свободен";
    public static final String STATUS_RESERVED = "занят";

    public Car(String carNumber, String carMark, int carClass,
               String status, boolean isHaveBabySeat, boolean isHaveSmoke) {
        this.carNumber = carNumber;
        this.carMark = carMark;
        this.carClass = carClass;
        this.status = status;
        this.isHaveBabySeat = isHaveBabySeat;
        this.isHaveSmoke = isHaveSmoke;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public int getCarClass() {
        return carClass;
    }

    public void setCarClass(int carClass) {
        this.carClass = carClass;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isHaveBabySeat() {
        return isHaveBabySeat;
    }

    public void setHaveBabySeat(boolean haveBabySeat) {
        isHaveBabySeat = haveBabySeat;
    }

    public boolean isHaveSmoke() {
        return isHaveSmoke;
    }

    public void setHaveSmoke(boolean haveSmoke) {
        isHaveSmoke = haveSmoke;
    }
}
