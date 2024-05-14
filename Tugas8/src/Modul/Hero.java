package Modul;

public class Hero {
    private String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    //getter
    public double getHealty(){
        return this.health;
    }
    public String getName(){
        return this.name;
    }

    //setter
    public void setNama (String name){
        this.name = name;
    }

    public void setHealty(){
        this.health = health; 
    }

    // method umum
    public void display(){
        System.out.println(this.name + " is a regular hero.");
    }
}
