package Tugas7.src.Polimorfisme;

public class Operator extends Employee{
    public Operator(String name, String noKTP) {
        super(name, noKTP);
    }

    @Override
    public double earnings() {
        return calculateSalary(); // Operator memiliki penghasilan yang sama dengan gaji
    }
}
