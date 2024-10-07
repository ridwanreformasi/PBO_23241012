import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("     KALKULATOR SEDERHANA   ");
        System.out.println("==========================");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Perkalian");
            System.out.println("2. Penjumlahan");
            System.out.println("3. Pengurangan");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");

            System.out.print("\nMasukkan Pilihan Anda: ");
            int pilihan = ambilPilihan(input);

            if (pilihan == 1) {
                perkalian(input);
            } else if (pilihan == 2) {
                penjumlahan(input);
            } else if (pilihan == 3) {
                pengurangan(input);
            } else if (pilihan == 4) {
                pembagian(input);
            } else if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silahkan pilih menu 1-5.");
            }
        }
        input.close(); // Menutup Scanner
    }

    private static int ambilPilihan(Scanner input) {
        while (true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                input.next(); // Mengabaikan input yang tidak valid
            }
        }
    }

    private static void perkalian(Scanner input) {
        double bil1 = ambilBilangan(input, "pertama");
        double bil2 = ambilBilangan(input, "kedua");
        double hasil = bil1 * bil2;
        System.out.println("Hasil perkalian: " + hasil);
    }

    private static void penjumlahan(Scanner input) {
        double bil1 = ambilBilangan(input, "pertama");
        double bil2 = ambilBilangan(input, "kedua");
        double hasil = bil1 + bil2;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    private static void pengurangan(Scanner input) {
        double bil1 = ambilBilangan(input, "pertama");
        double bil2 = ambilBilangan(input, "kedua");
        double hasil = bil1 - bil2;
        System.out.println("Hasil pengurangan: " + hasil);
    }

    private static void pembagian(Scanner input) {
        double bil1 = ambilBilangan(input, "pertama");
        double bil2 = ambilBilangan(input, "kedua");

        if (bil2 == 0) {
            System.out.println("Tidak bisa membagi dengan nol.");
        } else {
            double hasil = bil1 / bil2;
            System.out.println("Hasil pembagian: " + hasil);
        }
    }

    private static double ambilBilangan(Scanner input, String urutan) {
        System.out.print("Masukkan bilangan " + urutan + ": ");
        while (true) {
            try {
                return input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                input.next(); // Mengabaikan input yang tidak valid
            }
        }
    }
}
