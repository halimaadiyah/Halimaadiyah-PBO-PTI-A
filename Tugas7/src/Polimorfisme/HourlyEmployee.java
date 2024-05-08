package Tugas7.src.Polimorfisme;

public class HourlyEmployee extends Employee {
    private double wage; //upah per-jam
    private double hours; //jumlah jam-tiap minggu
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, String noKTP, double hourlyWage, double hoursWorked){
        super(name, noKTP);
        setWage (hourlyWage);
        setHours (hoursWorked);
    }

    //penambahan objek no.4
    public HourlyEmployee(String name, int birthMonth, double salary, double hoursWorked, double hourlyRate) {
        super(name, birthMonth, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Accessor no.4
    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + (hoursWorked * hourlyRate);
    }

    public void setWage (double hourlyWage){
        wage = hourlyWage;
    }

    public double getWage(){
        return wage;
    }

    public void setHours (double hoursWorked){
        hours = hoursWorked;
    }

    public double getHours(){
        return hours;
    }

    public double earnings (){
        if(getHours()<=40)
        return getWage() * getHours();
        else
        return 40 * getWage() + (getHours ()-40) * getWage() *1.5;
    }

    public String toString(){
        return String.format("Hourly employee:"+super.toString() +"\nhourly wage"+getWage()+"nhours worked:"+getHours());
    }
}
