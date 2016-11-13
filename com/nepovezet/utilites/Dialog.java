package com.nepovezet.utilites;

import com.nepovezet.entity.Car;
import com.nepovezet.entity.Driver;
import com.nepovezet.entity.Order;
import com.nepovezet.tools.TaxiException;

import static com.nepovezet.tools.SOPrint.println;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by N on 12.11.2016.
 * этот класс ведет диалог с пользователем, помогает создать заявку на автомобиль и
 * дает ответы на его запрос
 */
public class Dialog {
    private static Dialog ourInstance = new Dialog();

    public static Dialog getInstance() {
        return ourInstance;
    }

    private Dialog() {
    }

    DataBase dataBase = DataBase.getInstance();
    private static int idOrders = -1;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void newOrder() throws Exception {

        String start;
        String end;
        boolean answerBabySeat;
        boolean answerNeedSmoke;
        int answerCarClass;

        println("Введите начальную точку вашего маршрута:");
        start = reader.readLine();

        println("Введите конечную точку вашего маршрута:");
        end = reader.readLine();

        println("нужно ли вам детское сиденье? Y/N :");
        answerBabySeat = setAnswerBool();

        println("будете ли вы курить в дороге? Y/N :");
        answerNeedSmoke = setAnswerBool();

        println("вам нужен комфортный автомобиль? Y/N");
        answerCarClass = setAnswerCarClass();

        idOrders++;
        dataBase.baseOrders.add(new Order(idOrders, start, end, answerBabySeat,
                answerNeedSmoke, answerCarClass));
    }

    //вызывается в случае несоответствия ни одного авто
    public static void negativeAnswer(){
        println("\nВ данный момент нет подходящего для вас автомобиля, " +
                "заявка ожидает подходящего, освободившегося автомобиля\n");
    }
    //дает всю инфу о нужном авто
    public static void answerReservedCar(Driver driver){
        driver.getCar().setStatus(Car.STATUS_RESERVED);
        println("\n Номер вашего заказа №" + idOrders + "\n" +
                "Вас ожидает автомобиль: \n" +
                "марки: " + driver.getCar().getCarMark() + "\n" +
                "номерной знак: " + driver.getCar().getCarNumber() + "\n" +
                "имя водителя: " + driver.getName() + " " + driver.getSurname() + "\n" +
                "телефон для связи с водителем: " + driver.getPhoneNumber() + "\n");
    }
    //следующие два метода обрабатывают запросы пользователя
    private int setAnswerCarClass() throws Exception{
        String answer;
        try{
            answer = reader.readLine();
            if(answer.equals("Y") || answer.equals("N"));
            else throw new TaxiException();
            if(answer.equals("Y"))return Car.CLASS_BUSYNESS;
            else return Car.CLASS_ECONOMIC;

        }catch(TaxiException exc){
            System.out.println(exc);
            return Car.CLASS_ECONOMIC;
        }
    }

    private boolean setAnswerBool() throws Exception{
        String answer;
        try{
            answer = reader.readLine();
            if(answer.equals("Y") || answer.equals("N"));
            else throw new TaxiException();
            if(answer.equals("Y"))return true;
            else return false;

        }catch(TaxiException exc){
            System.out.println(exc);
            return false;
        }
    }

    public static int getIdOrders() {
        return idOrders;
    }
}


