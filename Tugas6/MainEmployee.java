package Tugas6;
public class MainEmployee {
    public static void main(String[] args) {
        Manager boss = new Manager("Steven", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee staff = new Employee("Donni", 50000, 1989, 10, 1);

        // panggil konstruktor no 6
        // Manager manager = new Manager ('wiliam');
        // Pembenahannya
        Manager manager = new Manager("rino", 90000, 20000, 1, 10);

        System.out.println("nama boss : "+ boss.getName()+", salary = "+ boss.getSalary());
        System.out.println("nama staff : "+staff.getName()+", salary = "+staff.getSalary());
        System.out.println("nama manager: "+ manager.getName()+", salary = "+manager.getSalary());
    }
}