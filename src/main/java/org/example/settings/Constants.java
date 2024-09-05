package org.example.settings;

public class Constants {
    private static Constants constants;

    private Constants(){
    }

    public Object getConstant(String key){
        return System.getenv(key);
    }

    public static synchronized Constants getConstants(){
        if(Constants.constants == null){
            Constants.constants = new Constants();
        }
        return Constants.constants;
    }
}
