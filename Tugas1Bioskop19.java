import java.util.Scanner;

public class Tugas1Bioskop19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tiket, totalTiket = 0;
        double totalPenjualan = 0;
        int hargaTiket = 50000;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Input tidak valid!");
                continue;
            } else if (tiket == 0) {
                break;
            } else {
                double harga = tiket * hargaTiket;

                if (tiket > 10) {
                    harga = harga * 0.85;
                } else if (tiket > 4) {
                    harga = harga * 0.90;
                }

                totalTiket += tiket;
                totalPenjualan += harga;

                System.out.println("Total harga: Rp" + harga);
            }

        } while (true);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

        sc.close();
    }
}