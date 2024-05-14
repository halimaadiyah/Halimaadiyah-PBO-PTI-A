package Modul;

public class HeroIntel extends Hero {
    String type;
    // public string type; 
    // no. 4

    public HeroIntel (String name, double health){
        super(name, health);
        this.type = "Intel";
    }

    public void display (){
        System.out.println(this.getName() + " is a " + this.type + " Hero. ");
    }
}
