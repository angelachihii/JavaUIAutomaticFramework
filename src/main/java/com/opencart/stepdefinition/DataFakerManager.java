package com.opencart.stepdefinition;

public class DataFakerManager {

    public static String generateFirstName() {
        return DataFakerManager.getRandomName();
    }

    public static String generateLastName() {
        return DataFakerManager.getRandomName();
    }

    public static String generateRandomEmail() {
        return DataFakerManager.getRandomEmail();
    }

    public static String generatePassword(int minLength, int maxLength) {
        return DataFakerManager.getRandomPassword(minLength, maxLength);
    }

    static String getRandomName() {

        return "John";
    }

    static String getRandomEmail() {

        return "random@example.com";
    }

    static String getRandomPassword(int minLength, int maxLength) {

        return "randomPassword123";
    }
}
