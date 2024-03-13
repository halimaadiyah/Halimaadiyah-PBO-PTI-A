public class BukuCatatan {
    private int jumlahPerLembar;
    private int isiKataPerLembar;

    public BukuCatatan(int jumlahLembar, int kataPerLembar) {
        this.jumlahPerLembar = jumlahLembar;
        this.isiKataPerLembar = kataPerLembar;
    }

    public int getJumlahLembar() {
        return jumlahPerLembar;
    }

    public void setJumlahLembar(int jumlahLembar) {
        this.jumlahPerLembar = jumlahLembar;
    }

    public int getKataPerLembar() {
        return isiKataPerLembar;
    }

    public void setKataPerLembar(int kataPerLembar) {
        this.isiKataPerLembar = kataPerLembar;
    }

    public int hitungHariUntukMengisiBukuCatatan(Mahasiswa mahasiswa) {
        int totalKata = jumlahPerLembar * isiKataPerLembar;
        int hari = totalKata / mahasiswa.getJumlahKataPerHari();
        return hari;
    }

}

