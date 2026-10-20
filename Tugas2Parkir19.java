import java.util.Scanner;

public class Tugas2Parkir19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int jenis, durasi;
        int harga = 0;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk selesai): ");
            jenis = sc.nextInt();

            if (jenis < 0) {
                System.out.println("Input tidak valid!");
                continue;
            } else if (jenis == 0) {
                break;
            } else {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    harga = 3000 * durasi;
                } else if (jenis == 2) {
                    harga = 2000 * durasi;
                }

                total += harga;
            }

        } while (true);

        System.out.println("Total pendapatan: Rp" + total);

        sc.close();

  }

}