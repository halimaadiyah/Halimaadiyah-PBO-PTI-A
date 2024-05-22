public class Hewan implements MakhlukHidup, Identitas {
    
    @Override
    public void makan(){
        System.out.println("Makan Pakai Tangan dan Mulut");}
    
    @Override
    public void berjalan(){
        System.out.println("Jalan Pakai 4 Kaki");}

    @Override
    public void bersuara(){
        System.out.println("Suaranya nggak jelas");}

    public void tampilkanNama(){}
    public void tampilkanUmur(){}
}
