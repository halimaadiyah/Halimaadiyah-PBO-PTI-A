package Tugas4.T4;

public class Rasional {

    private int pembilang, penyebut;
    public Rasional(){
        pembilang=0;
        penyebut=0;
    }

    public Rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
    }

    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
        return (penyebut!= 0);
    }
    
    //menyederhanakan bilangan rasional
    public void Sederhana(){
        int temp, A, B;
        if (penyebut ==0){
            return;
        }

        A = (pembilang<penyebut) ? penyebut:pembilang;
        B = (pembilang<penyebut) ? pembilang:penyebut;

        while (B != 0){
            temp= A % B;
            A = B;
            B = temp;
        }

        // B. jawaban no 03 | mengubah while menjadi for
        for (; B != 0; ){
            temp = A % B;
            A = B;
            B = temp;
        }



        pembilang /=A;
        penyebut /=A;
    }

    public double Cast(){
        return (penyebut==0.0) ? 0.0 : (double)pembilang / (double)penyebut;
    }

    //oprator >
    public boolean moreThan (Rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    // B. jawaban no 2
    public boolean kurangDari (Rasional A){
        return(pembilang * A.penyebut < penyebut * pembilang);
    }

    public boolean lebihDariSamaDengan (Rasional A){
        return(pembilang * A.penyebut >= penyebut * pembilang);
    }

    public boolean kurangDariSamaDengan (Rasional A){
        return(pembilang * A.penyebut <= penyebut * pembilang);
    }

    //operator Unary- ---> A = -A
    public void negasi(){
        pembilang = - pembilang;
    }

    //operator unary += \
    public void unaryPlus(Rasional A){
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *=A.penyebut;
    }

    // Jawaban b no 04
    public void kurang(Rasional A){
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    public void kali(Rasional A){
        pembilang = pembilang * A.penyebut;
        penyebut = penyebut * A.pembilang;
    }

    public void bagi(Rasional A){
        pembilang = pembilang * A.penyebut;
        penyebut = penyebut * A.pembilang;
    }

    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    } 

    
}