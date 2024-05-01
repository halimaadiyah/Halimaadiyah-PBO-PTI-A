package Tugas6.src.Praktikum;


    public class MahasiswaFILKOM extends Manusia {
        private String nim;
        private double ipk;
        private String nama;
    
        // sebagai construktor
        public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
            super(nama, jenisKelamin, nik, menikah, nim, ipk);
            this.nim = nim;
            this.ipk = ipk;
            
        }
    
    
        // sebagai setter dan getter
        
        public String getNim() {
            return nim;
        }
    
        public void setNim(String nim) {
            this.nim = nim;
        }
    
        public double getIpk() {
            return ipk;
        }
    
        public void setIpk(double ipk) {
            this.ipk = ipk;
        }
        
        // sebagai method untuk mendapatkan status 
        public String getStatus() {
            String prodi = "";
            String angkatan = nim.substring(0, 2);
            String prodiCode = nim.substring(6, 0);
    
            switch (prodiCode) {
                case "2":
                    prodi = "Teknik Informatika";
                    break;
                case "3":
                    prodi = "Teknik Komputer";
                    break;
                case "4":
                    prodi = "Sistem Informasi";
                    break;
                case "6":
                    prodi = "Pendidikan Teknologi Informasi";
                    break;
                case "7":
                    prodi = "Teknologi Informasi";
                    break;
            }
    
            return prodi + ", " + "20" + angkatan;
        }
    
        // sebagai Method dimana dengan berpatokan ipk yang akan menjadi penentu hasil beasiswa yang di dapatkan
        public double getBeasiswa() {
            if (ipk >= 3.0 && ipk <= 3.5) { // ketika ipk 3.0 sampai dengan 3.5 mendapati beasiswa 50%
                return 50.0;
            } else if (ipk > 3.5 && ipk <= 4.0) { // ketika ipk 3.5 sampai 4 mendapati beasiswa 75%
                return 75.0;
            } else {
                return 0.0; // jika tidak memenuhi syarat
            }
        }

        public String toString() { // pada methode tostring ini berfungsi untuk mengembalikan representasi string objek yang mencakup nilai nim, ipk, status
            return super.toString() + "\nnim : " + nim + "\nipk : " + ipk + "\nstatus : " + getStatus();
        }
}