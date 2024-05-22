package praktikumNV;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    // Constructor
    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    // Implementasi dari interface Payable
    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return totalInvoiceAmount;
    }

    // Getter untuk nomor registrasi
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    // Getter untuk nama karyawan
    public String getName() {
        return name;
    }

    // Getter untuk gaji per bulan
    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    // Getter untuk invoice
    public Invoice[] getInvoices() {
        return invoices;
    }
}
