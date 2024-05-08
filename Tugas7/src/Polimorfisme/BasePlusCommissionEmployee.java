package Tugas7.src.Polimorfisme;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; //gaji pokok tiap minggu

    public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary){
        super(name, noKTP, sales, rate);
        setBaseSalary(salary);
    }

    // penambahan objek no.4
    public BasePlusCommissionEmployee(String name, int birthMonth, double salary, double sales, double commissionRate, double baseSalary) {
        super(name, birthMonth, salary, sales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary (double salary){
        baseSalary = salary;
    }

    //Accesor
    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + baseSalary;
    }

    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    public String toString(){
        return String.format("Base-Salaried "+ super.toString() + "\nbase salary " + getBaseSalary());
    }
}
