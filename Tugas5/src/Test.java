package Tugas5.src;

public class Test {
    public static void main(String[] args) {
    Student s1=new Student();
    s1.setName("Enkapsulasi");
    s1.setMark(90);
    // s1.setMark("90"); 
    // setMark terjadi erorr sebab memakai tipe data int dimana bila memakai tipe data ini di dlm kurung tidak perlu adanya petik

    // no 02. terjadi tidak eror sebab sudah sesuai dimana telah memanggil enkapulasi yang sesuai dengan yang suda dimasukkan tadi
    System.out.println("s1Name is "+s1.getName());
    System.out.println("s1Mark is "+s1.getMark());

    // System.out.println("s1Name is "+s1.setName());
    // System.out.println("s1Mark is "+s1.setMark());
    // pemanggilan enkapulasi tidak sama dengan yang suda di tulis dimana yang seharusnya getName dan setName

    System.out.println("nama dan mark " +s1.getName()+" "+s1.getMark());
    
    // System.out.println("name dan mark "+name+" "+mark);
    // seharusnya ini memanggil mutator bukan attibute nya, supaya tidak terjadi erorr





    }
}
