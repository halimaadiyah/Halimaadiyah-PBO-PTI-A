package Tugas7.src.Polimorfisme;

public class SalariedEmployee extends Employee {
    private double weeklySalary; // gaji per-minggu

    public SalariedEmployee (String name, String noKTP, double salary){
        super(name, noKTP);
        setWeeklySalary(salary);
    }

    //penambahan objek no.4
    public SalariedEmployee(String name, int birthMonth, double salary) {
        super(name, birthMonth, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary();
    }

    public void setWeeklySalary(double salary){
        weeklySalary = salary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    public double earnings(){
        return getWeeklySalary();
    }

    public String toString(){
        return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());
    }
}
