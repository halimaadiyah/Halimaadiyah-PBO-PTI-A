package Tugas5.src;

public class Student {
    private String name;
    private int mark;
    public void setName(String n){
    // no 03 bila di ubah dalam private, di class test maka terjadi erorr, sebab bila private tdk bisa melakukan penggilan di class lain
        name=n;
    }
    public String getName(){
        return name;
    } 
    public void setMark(int m){
        mark=m;
    } 
    public int getMark(){
        return mark;
    }


    // no 04. tetap berfungsi, disebabkan tidak terdapat adanya erorr
    // public static void main(String[] args) {
    //     Student s1=new Student();
    //         s1.setName("Enkapsulasi");
    //         s1.setMark(90);

    //         System.out.println("s1Name is "+s1.getName());
    //         System.out.println("s1Mark is "+s1.getMark());

    //         System.out.println("nama dan mark " +s1.getName()+" "+s1.getMark());
    // }

}
