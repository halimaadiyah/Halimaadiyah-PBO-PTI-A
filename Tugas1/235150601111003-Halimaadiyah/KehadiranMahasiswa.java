import java.util.Scanner;

public class KehadiranMahasiswa {
    private static final int SEMUA_MAHASISWA = 10;
    private static String[] namaMahasiswa = new String[SEMUA_MAHASISWA];
    private static boolean[] statusKehadiran = new boolean[SEMUA_MAHASISWA];
    private static int numMahasiswa = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama mahasiswa
        inputnamaMahasiswa(scanner);

        // Menandai kehadiran
        menandaikehadiran(scanner);

        // Menampilkan Status Kehadiran
        menampilkanstatuskehadiran( );

        scanner.close();
    }

    private static void inputnamaMahasiswa(Scanner scanner) {
        System.out.println("Enter nama mahasiswa (enter 'done' ketika selesai):");
        while (numMahasiswa < SEMUA_MAHASISWA && !scanner.hasNext("done")) {
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                namaMahasiswa[numMahasiswa] = name;
                numMahasiswa++;
            }
        }
    }

    private static void menandaikehadiran(Scanner scanner) {
        System.out.println("Enter kehadiran status (hadir atau tidak hadir):");
        for (int i = 0; i < numMahasiswa; i++) {
            String status = scanner.nextLine();
            if (status.equalsIgnoreCase("hadir")) {
                statusKehadiran[i] = true;
            } else if (status.equalsIgnoreCase("tidak hadir")) {
                statusKehadiran[i] = false;
            } else {
                System.out.println("Invalid input. silahkan masukkan 'hadir' or 'tidak hadir'.");
                i--;
            }
        }
         
    }
    private static void menampilkanstatuskehadiran() {
        System.out.println("\nstatus Kehadiran Mahasiswa:");
        for (int i = 0; i < numMahasiswa; i++) {
            System.out.printf("%s: %s%n", namaMahasiswa[i], statusKehadiran[i] ? "Hadir" : "tidak hadir");
        }
 }
    
}