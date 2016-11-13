package com.nepovezet.utilites;

import com.nepovezet.entity.Driver;
import com.nepovezet.entity.Car;
import com.nepovezet.entity.Order;

import java.util.ArrayList;

/**
 * Created by N on 12.11.2016.
 * Здесь происходит перебор автомобилей, в случае соответствия условиям
 * вызывается метод Dialog.answerReservedCar(driver) который сообщает
 * всю нужную информацию об автомобиле.
 * В случае несоответствия вызывается Dialog.negativeAnswer()
 */
public class CarSelection {
    private static CarSelection ourInstance = new CarSelection();
    public static CarSelection getInstance() {
        return ourInstance;
    }
    private CarSelection() {
    }

    public static void search(ArrayList<Driver> driverArrayList, Order order) {
        boolean isOk = false;
        for (Driver driver : driverArrayList) {
            if (driver.getCar().getCarClass() == order.getNeedCarClass() &&
                    driver.getCar().isHaveBabySeat() == order.isNeedBabySeat() &&
                    driver.getCar().isHaveSmoke() == order.isNeedSmoke() &&
                    driver.getCar().getStatus() == Car.STATUS_FREE) {

                order.setNeedDriver(driver);
                Dialog.answerReservedCar(driver);
                isOk = true;
                break;
            }
        }
        if(isOk);
        else Dialog.negativeAnswer();
    }
}
