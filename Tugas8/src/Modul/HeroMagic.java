package Modul;

// implementasi membuat clas baru untuk no.5
public class HeroMagic extends Hero {
    private String power;

    HeroMagic(String name, double health){
        super(name, health);
        this.power = "Magic";
    }

    // getter
    public String getPower() {
        return this.power;
    }

    // method 
    public void display() {
        System.out.println(this.getName() + " is a Magic Hero with power " + this.power + ".");
    }
}
