package com.escuelita.java8.utils;

import java.util.Date;

public class LoggerUtils {


    public static Date getDateNow(){
        return  new Date();
    }

    public static String getDateOperationResultInMiliseconds(Date date){
        Date dateNow = new Date();
        return "La operacion se resolvio en: [" + (dateNow.getTime() - date.getTime()) + "] milisegundos.";
    }


}
