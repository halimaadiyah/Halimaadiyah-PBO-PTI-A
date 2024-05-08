package Tugas7.src.Polimorfisme;

public class Main {
    public static void main(String[] args) {
       // Employee employee = new Employee();
        // no.1 terjadi erorr. maka tidak ada keluaran dari kode program tersebut, 
        // bila ingin memperbaikinya perlu menambahkan kontruktor tanpa argumen pada class Employee

        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300);
        System.out.println("Employee diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        System.out.println("Employees di proses secara polimorfisme:\n");
        for (Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10* employee.getBaseSalary());
                System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
            }
            for (int j = 0; j<employees.length; j++){
                System.out.printf("Employee %d = %s\n", j,employees[j].getClass().getName());
            }
        }
        // no.2 analisis yang bisa saya lalukan dengan berpacuan dari konsep polimorfisme, kode diatas berguna untuk memproses semua class dalam array, 
        // peran polimorfisme ini memungkinkan objek dari class yang berbeda di perlakukan seolah-olah mereka adalah objek dari superclass yang sama
        // dimana perulangan pertama guna untuk mencetak rincian setiap objek karyawan (nama,id,penghasilan), 
        // perulangan ke 2 memeriksa apakah setiap objek karyawan merupakan turunan dari 'BasepluseCommisionEmployee' 

        //method instant, no 3 terjadi eror sebab pada class employee merupakan 
        //class abstrak dimana class abstrak itu tidak bisa di instansiasi
        //public void employee() {
        //System.out.println("Name: " + name);
        //System.out.println("Position: " + position);
        //System.out.println("Salary: " + salary);
        //}
        //Employee employee1 = new Employee("ruru", "Software Engineer", 80000);
        //employee1.displayDetails();

        System.out.println();

        // implementasi dari perintah nomor 4
        // Membuat objek dari semua kelas Employee
        Employee[] employ = new Employee[4];
        employees[0] = new SalariedEmployee("pak arya", 5, 2000000);
        employees[1] = new HourlyEmployee("pak arda", 8, 0, 160, 10000);
        employees[2] = new CommissionEmployee("pak arka", 3, 1500000, 5000000, 0.05);
        employees[3] = new BasePlusCommissionEmployee("pak azka", 11, 1200000, 4000000, 0.04, 500000);

        // Hitung gaji secara polimorfisme dan tambahkan gaji jika bukan bulan ulang tahun
        for (Employee employee : employees) {
            double totalSalary = employee.calculateTotalSalary();
            System.out.println("Employee: " + employee.getName());
            System.out.println("Total Salary: " + totalSalary);
            System.out.println();
        }


        // no-5
        // Membuat objek karyawan dan menguji perhitungan gaji
        // pengimplementasian dari nomor 5 dimana ingin menambahkan kreteria baru
        // untuk penggajian karyawan dimana penggajian ini berdasarkan dari banyak barang yang di produksi
        // lalu pada gaji karyawan dimana hasil banyak barang yang ia produksi perminggunya lalu dikalikan upah dari per-barangnya
        Operator operator = new Operator("pak agus", "123456789");
        operator.setProductionInfo(1000, 100); // Misalnya, 1000 barang diproduksi dengan upah per barang 100
        System.out.println("Gaji Operator " + operator.getName() + ": " + operator.earnings());

        Supervisor supervisor = new Supervisor("pak santo", "987654321");
        supervisor.setProductionInfo(1500, 120); // Misalnya, 1500 barang diproduksi dengan upah per barang 120
        System.out.println("Gaji Supervisor " + supervisor.getName() + ": " + supervisor.earnings());

        Manager manager = new Manager("pak yanuar", "567890123");
        manager.setProductionInfo(2000, 150); // Misalnya, 2000 barang diproduksi dengan upah per barang 150
        System.out.println("Gaji Manager " + manager.getName() + ": " + manager.earnings());

        Operator operator2 = new Operator("pak rudi", "456789012");
        operator2.setProductionInfo(800, 80); // Misalnya, 800 barang diproduksi dengan upah per barang 80
        System.out.println("Gaji Operator " + operator2.getName() + ": " + operator2.earnings());
    }
}
