package Tugas7.src.Polimorfisme;

public class CommissionEmployee extends Employee {
    private double grossSales; //penjualan perminggu
    private double commissionRate; //komisi

    public CommissionEmployee (String name, String noKTP, double sales, double rate){
        super(name, noKTP);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

     //penambahan objek no.4
     public CommissionEmployee(String name, int birthMonth, double salary, double sales, double commissionRate) {
        super(name, birthMonth, salary);
        this.grossSales = sales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales (double sales){
        grossSales = sales;
    }

    // Accesor no.4
    public double getGrossSales (){
        return grossSales;
    }

    public void setCommissionRate(double rate){
        commissionRate = rate;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + (grossSales * commissionRate);
    }

    public double getCommissionRate (){
        return commissionRate;
    }

    public double earnings(){
        return getCommissionRate()*getGrossSales();
    }

    public String toString(){
        return String.format("Commision employee:"+super.toString()+"\ngross sales:"+getGrossSales()+"\ncommisssion rate"+getCommissionRate());
    }
}
