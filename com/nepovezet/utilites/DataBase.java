package com.nepovezet.utilites;

import com.nepovezet.entity.Car;
import com.nepovezet.entity.Driver;
import com.nepovezet.entity.Order;

import java.util.ArrayList;

/**
 * Created by N on 12.11.2016.
 * При запуске программы в конструкторе класса автоматически инициализируется
 * листы водителей и автомобилей
 */
public class DataBase {
    private static DataBase ourInstance = new DataBase();

    public ArrayList<Driver> staff = new ArrayList<Driver>();
    public ArrayList<Car> parking = new ArrayList<Car>();
    public ArrayList<Order> baseOrders = new ArrayList<Order>();

    private DataBase() {
        parking.add(new Car("df 834", "BMW", Car.CLASS_BUSYNESS, Car
                .STATUS_FREE, true, false));
        parking.add(new Car("bt 352", "FIAT", Car.CLASS_BUSYNESS, Car
                .STATUS_FREE, true, true));
        parking.add(new Car("lr 742", "LADA", Car.CLASS_ECONOMIC, Car
                .STATUS_FREE, false, false));
        parking.add(new Car("qw245", "LADA", Car.CLASS_ECONOMIC, Car
                .STATUS_FREE, false, false));
        parking.add(new Car("ot 248", "LADA", Car.CLASS_ECONOMIC, Car
                .STATUS_FREE, true, false));
        parking.add(new Car("kf 565", "Skoda", Car.CLASS_BUSYNESS, Car
                .STATUS_FREE, false, false));
        parking.add(new Car("rt 045", "AUDI", Car.CLASS_BUSYNESS, Car
                .STATUS_FREE, false, true));
        parking.add(new Car("yy 555", "LADA", Car.CLASS_ECONOMIC, Car
                .STATUS_FREE, false, true));
        parking.add(new Car("df 987", "AUDI", Car.CLASS_BUSYNESS, Car
                .STATUS_FREE, false, false));
        parking.add(new Car("zz 777", "LADA", Car.CLASS_ECONOMIC, Car
                .STATUS_FREE, false, false));

        staff.add(new Driver("Alexand", "Brechalov", 88003535, parking.get(0), 0));
        staff.add(new Driver("Boris", "Titiv", 88002463, parking.get(1), 1));
        staff.add(new Driver("Andrey", "Makarov", 88004673, parking.get(2), 2));
        staff.add(new Driver("Olga", "Batalina", 88003561, parking.get(3), 3));
        staff.add(new Driver("Zahar", "Prelepin", 88008321, parking.get(4), 4));
        staff.add(new Driver("Ella", "Pamfilova", 88007933, parking.get(5), 5));
        staff.add(new Driver("Sergey", "Neverov", 88003122, parking.get(6), 6));
        staff.add(new Driver("Sergey", "Aksenov", 88003651, parking.get(7), 7));
        staff.add(new Driver("Pavel", "Krashennikov", 88001234, parking.get(8), 8));
        staff.add(new Driver("Natalia", "Poklonskaya", 88004321, parking.get(9), 9));
    }

    public static DataBase getInstance() {
        return ourInstance;
    }



}
