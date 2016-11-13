package com.nepovezet.tools;

/**
 * Created by N on 13.11.2016.
 */
public class TaxiException extends Exception {

    public String toString(){
        return "Некорректный ввод данных, следуйте инструкции\n" +
                "(автоматически выбран отрицательный ответ)";}
}
