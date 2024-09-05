package org.example;

public class Pokemon {
    private String name;
    private String type;
    private int lvl;

    public Pokemon(String name, String type, int lvl) {
        this.name = name;
        this.type = type;
        this.lvl = lvl;
    }

    public String toString(){
        return "Hello, I am your new pokemon! \nMy name is: "+ name + "\nMy type is: "+type+"\nMy lvl is: "+lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
