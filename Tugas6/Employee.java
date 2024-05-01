import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {
    private String name;
    private double salary;
    private Date hireday;

    // contruktor dengan parameter string name no.3 & 6
    public Employee(String name) {
        this.name = name;
    }

    // pembenahan no 6
    public Employee(String name, double salary, Date hireday){
        this.name = name;
        this.salary = salary;
        this.hireday = hireday;
    }

    public Employee (String name, double salary, int year, int month, int day){
        // no 5 perintah hapus nilai this
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        this.hireday = calendar.getTime();
    }

    public Date getHireDay(){
        return hireday;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary (double byPercent){
        double raise = salary * byPercent/100;
        salary+=raise;
    }

    // no 8 ubah metode menjadi private dan protected 
    // protected Date getHireDay(){
    //     return hireday;
    // }

    // protected String getName(){
    //     return name;
    // }

    // protected double getSalary(){
    //     return salary;
    // }

    // protected void raiseSalary (double byPercent){
    //     double raise = salary * byPercent/100;
    //     salary+=raise;
    // }

    // private Date getHireDay(){
    //     return hireday;
    // }

    // private String getName(){
    //     return name;
    // }

    // private double getSalary(){
    //     return salary;
    // }

    // private void raiseSalary (double byPercent){
    //     double raise = salary * byPercent/100;
    //     salary+=raise;
    // }


}
