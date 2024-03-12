package Tugas3.src;

public class MainManusia {
    public static void main(String[] args) {
        manusia manusia1 = new manusia("rere", false, 7, "peserta didik", "cina", "islam");
        manusia1.main();
        manusia1.makan("sushi");
        manusia1.beribadah(true);
        manusia1.expresi();
    }
}
