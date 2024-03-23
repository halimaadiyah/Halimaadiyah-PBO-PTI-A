package Tugas4.T4.src;

public class lingkaran {
    int alas, tinggi;
    public lingkaran(int alas){
        this.alas = alas;
    }

    public lingkaran(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // B.no 02 | apabila ditambahkan constructor dengan parameter int tinggi 
    //  yang terjadi erorr, di sebabkan para meter sama dengan parameter lain
    // public lingkaran(int tinggi){
    //     this.tinggi = tinggi;
    // }

    // B.no 03
    public lingkaran(String alas, String tinggi){
        this.alas = parseInt(alas);
        this.tinggi = parseInt(tinggi);
    }
    private int parseInt(String value){
        try{
            return Integer.parseInt(value);
        }catch(NumberFormatException e){
            System.out.println("Parsing value tidak sesuai : " +value );
            return 0;
        }
    } 

    public void setAlas(int alas){
        this.alas = alas;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public int getAlas(){
        return alas;
    }

    public int getTinggi(){
        return tinggi;
    }

    public double hitungLuas(){
        double hasil = (double)(getTinggi()*getAlas())/2;
        return hasil;
    }
    
    public void displayMessage(){
        System.out.println("Hitung Luas : "+hitungLuas());
    } 


}    

