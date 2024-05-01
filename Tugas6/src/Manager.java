package Tugas6.src;

public class Manager extends employee {
    private double bonus;
    public Manager (String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day); 
        // no 4, bila di line 5 menambahkan "bonus" maka akan terjadi eror
        // no 2, Manager merupakan sub-class employee
        bonus = 0;
    }

    // no 5, apabila pada class manager dan employee this di hilangkan maka terjadi erorr 
    // sebab this berperan cukup penting pada setter maupun konstruktor

    public void setBonus (double bonus){
        // no 5 perintah hapus nilai this
        this.bonus = bonus;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}
