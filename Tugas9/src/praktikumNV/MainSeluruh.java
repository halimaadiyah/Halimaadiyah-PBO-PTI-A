package praktikumNV;

public class MainSeluruh {
    public static void main(String[] args) {
        // Membuat objek invoice untuk karyawan
        Invoice[] invoices = {
            new Invoice("Beras", 2, 50000),
            new Invoice("Gula", 1, 20000)
        };

        // Membuat objek karyawan
        Employee employee = new Employee(242105, "Pak sumo", 2000000, invoices);

        // Menghitung total gaji yang harus dipotong
        double totalDeductedAmount = employee.getPayableAmount();
        
        // berisi untuk melakukan perhitungan gaji bersih karyawan
        double netSalary = employee.getSalaryPerMonth() - totalDeductedAmount;

        // berisi untuk menampilkan informasi yang berkaitan dengan karyawan
        System.out.println("Informasi Karyawan:");
        System.out.println("Nomor Registrasi: " + employee.getRegistrationNumber());
        System.out.println("Nama: " + employee.getName());
        System.out.println("Gaji Per Bulan: Rp " + String.format("%,d", employee.getSalaryPerMonth()));
        System.out.println("Total Hutang Belanjaan: $" + String.format("%,.0f", totalDeductedAmount));
        System.out.println("Gaji Bersih: $" + String.format("%,.0f", netSalary));

        // Berisi untuk menampilkan detail belanjaan karyawan pada koperasi
        System.out.println("\nDetail Belanjaan:");
        for (Invoice invoice : employee.getInvoices()) {
            System.out.println("Nama Produk: " + invoice.getProductName());
            System.out.println("Jumlah: " + invoice.getQuantity());
            System.out.println("Harga Per Item: Rp" + String.format("%,d", invoice.getPricePerItem()));
            System.out.println("Total: Rp" + String.format("%,.0f", invoice.getPayableAmount()));
            System.out.println();
        }
    }
}