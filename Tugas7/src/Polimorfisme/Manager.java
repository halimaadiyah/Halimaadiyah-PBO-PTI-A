package Tugas7.src.Polimorfisme;

public class Manager extends Employee {
    public Manager(String name, String noKTP) {
        super(name, noKTP);
    }

    @Override
    public double earnings() {
        return calculateSalary() * 1.5; // Manager mendapatkan 50% tambahan dari gaji
    }
}
