package Tugas7.src.Polimorfisme;

public class Supervisor extends Employee {
    public Supervisor(String name, String noKTP) {
        super(name, noKTP);
    }

    @Override
    public double earnings() {
        return calculateSalary() * 1.2; // Supervisor mendapatkan 20% tambahan dari gaji
    }
}
