package com.nepovezet;

import com.nepovezet.utilites.CarSelection;
import com.nepovezet.utilites.DataBase;
import com.nepovezet.utilites.Dialog;

/**
 * Created by N on 11.11.2016.
 */
public class main {
    public static void main(String[] args) throws Exception{

        DataBase dataBase = DataBase.getInstance();
        Dialog dialog = Dialog.getInstance();

        while(true) {
            dialog.newOrder();
            CarSelection.search(dataBase.staff,
                    dataBase.baseOrders.get(dialog.getIdOrders()));
        }
    }
}
