package org.example;

import org.example.settings.Constants;

public class Main {
    public static void main(String[] args) {
        Constants constants = Constants.getConstants();
        Object initialTest = constants.getConstant("INITIAL_TEXT");
        System.out.println(initialTest);
    }
}