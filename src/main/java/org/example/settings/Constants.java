package org.example.settings;

import io.github.cdimascio.dotenv.Dotenv;

public class Constants {
    private static Constants constants;
    private Dotenv envVariables;

    private Constants(){
        this.envVariables = Dotenv.load();
    }

    public Object getConstant(String key){
        return this.envVariables.get(key);
    }

    public static synchronized Constants getConstants(){
        if(Constants.constants == null){
            Constants.constants = new Constants();
        }
        return Constants.constants;
    }
}
