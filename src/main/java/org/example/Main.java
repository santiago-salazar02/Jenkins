package org.example;

import org.example.settings.Constants;

public class Main {
    public static void main(String[] args) {
        Constants constants = Constants.getConstants();
        String name = (String) constants.getConstant("NAME");
        String type = (String) constants.getConstant("TYPE");
        int lvl = Integer.parseInt((String) constants.getConstant("LVL"));
        Pokemon pokemon = new Pokemon(name,type,lvl);
        System.out.println(pokemon);
    }
}