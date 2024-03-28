package Tugas5.src;

public class AkunSwalayan {
    private String nama;
        private String customerNumber;
        private double balance;
        private double cashbackRate;
        private final int jenisRekening;
    
        public double getCashbackRate() {
            return cashbackRate;
        }

        public AkunSwalayan(String name, String customerNumber, int jenisRekening) {
            this.jenisRekening = jenisRekening;
            this.nama = name;
            this.customerNumber = customerNumber;
            this.balance = 10000.0;
            setCashbackRate();
        }
    
        // Accessor methods for Getter and Setter
        public int getJenisRekening() {
            return jenisRekening;
        }
        public String getNama() {
            return nama;
        }
    
        public void setName(String nama) {
            this.nama = nama;
        }
    
        public String getNomorAkunCustomer() {
            return customerNumber;
        }
    
        public void setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
        }
    
        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if (balance >= 10000.0) {
                this.balance = balance;
            } else {
                System.out.println("Saldo tidak mencukupi");
            }
        }

        public double setCashbackRate() {
            return cashbackRate;
        }

        public String getJenisRekeningString() {
            switch (jenisRekening) {
                case 38:
                    return "Silver";
                case 56:
                    return "Gold";
                case 74:
                    return "Platinum";
                default:
                    return "Tidak diketahui";
            }
        }
        
        public void tambahSaldo(int jumlah){
            balance += jumlah;
        }
        public void kurangSaldo(int jumlah){
            balance -= jumlah;
        }
        public void CashbackRate( int hargaPembelian) {
            String customerNumber = String.valueOf(cashbackRate);
            if (customerNumber.startsWith("38")) {
                if (balance > 1000000) {
                    cashbackRate = 0.5;
                } else {
                    cashbackRate = 0.0;
                }
            } else if (customerNumber.startsWith("56")) {
                if (balance > 1000000) {
                    cashbackRate = hargaPembelian * 0.7;
                } else {
                    cashbackRate = 0.2;
                }
            } else if (customerNumber.startsWith("74")) {
                if (balance > 1000000) {
                    cashbackRate = 0.10;
                } else {
                    cashbackRate = 0.5;
                }
            }
            System.out.println(nama + " mendapat cashback " + cashbackRate);
        }

        public int cashbackRate() {
            if (this.getJenisRekening() == 38) {
                if (this.getBalance() > 1000000) {
                    return (int) (this.getBalance() * 0.05);
                }
            } else if (this.getJenisRekening() == 56) {
                if (this.getBalance() > 1000000) {
                    return (int) (this.getBalance() * 0.07);
                } else {
                    return (int) (this.getBalance() * 0.02);
                }
            } else if (this.getJenisRekening() == 74) {
                if (this.getBalance() > 1000000) {
                    return (int) (this.getBalance() * 0.10);
                } else {
                    return (int) (this.getBalance() * 0.05);
                }
            }
        return 0;
    }
}
