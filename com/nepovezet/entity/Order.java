package com.nepovezet.entity;

/**
 * Created by N on 12.11.2016.
 */
public class Order {

    private int id;
    private String startPoint;
    private String endPoint;
    private boolean isNeedBabySeat;
    private boolean isNeedSmoke;
    private int needCarClass;
    private Driver needDriver;

    public Order(int id, String startPoint, String endPoint, boolean isNeedBabySeat,
                 boolean isNeedSmoke, int needCarClass) {
        this.id = id;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.isNeedBabySeat = isNeedBabySeat;
        this.isNeedSmoke = isNeedSmoke;
        this.needCarClass = needCarClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public boolean isNeedBabySeat() {
        return isNeedBabySeat;
    }

    public void setNeedBabySeat(boolean needBabySeat) {
        isNeedBabySeat = needBabySeat;
    }

    public boolean isNeedSmoke() {
        return isNeedSmoke;
    }

    public void setNeedSmoke(boolean needSmoke) {
        isNeedSmoke = needSmoke;
    }

    public int getNeedCarClass() {
        return needCarClass;
    }

    public void setNeedCarClass(int needCarClass) {
        this.needCarClass = needCarClass;
    }

    public Driver getNeedDriver() {
        return needDriver;
    }

    public void setNeedDriver(Driver needDriver) {
        this.needDriver = needDriver;
    }
}
