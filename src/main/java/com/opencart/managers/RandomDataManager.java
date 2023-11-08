package com.opencart.managers;

import com.github.javafaker.Faker;

public class RandomDataManager {
    private static Faker DataFakerObject = new Faker();
    public static  String generateRandomEmail(String prefix, String sufix){
        String randomMidPart = String.valueOf(DataFakerObject.random().nextInt(1, 999999));
  return prefix + randomMidPart + sufix;

    }
    public static String generateRandomEmail () {
        return DataFakerObject.internet().emailAddress();
    }
    public static String generateRandomFirstName(){
        return  DataFakerObject.name().firstName();
    }
    public static String generateRandomLastName(){
        return DataFakerObject.name().lastName();
    }
    public static String generatePhoneNumber(){
        return  DataFakerObject.phoneNumber().phoneNumber();
    }
    public  static String generateRandomPassword(){
        return DataFakerObject.internet().password();

    }



}

