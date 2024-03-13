public class Mobil {
       private String noPlat;
        private String warna;
        private String manufaktur;
        private int kecepatan;
        private double waktu;

      //   jawaban nomor 4
        public void setWaktu(double waktu){
              rubahSekon(waktu);
        }
       
      //   jawaban nomor 5
        private void rubahSekon(double waktu){
              this.waktu = waktu * 3600;
        }


        public void setNoPlat(String s){
        noPlat = s;
        }
        public void setWarna(String s){
        warna = s;
        }
        public void setManufaktur(String s){
        manufaktur = s;
        }

      //   jawaban nomor 6
        public void setKecepatan(int i){
        kecepatan = (int) rubahKecepatan(i);
        }

      //   jawaban nomor 7
        private double rubahKecepatan(int kecepatan){
              double rubahKecepatan = (double)kecepatan;
              return rubahKecepatan = (rubahKecepatan*10)/36;
        }

        public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek"+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        
      //   jawaban nomor 8
        System.out.println("dan mampu menempuh kecepatan"+kecepatan);
        }
 }
    
