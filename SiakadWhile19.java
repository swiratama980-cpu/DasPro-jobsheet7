import java.util.Scanner;

public class SiakadWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml;
        int i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }
 
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");

            } else if (nilai > 70 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 2) + " adalah B+");

            } else if (nilai > 60 && nilai <= 70) {
                System.out.println("Nilai mahasiswa ke-" + (i + 3) + " adalah B");

            } else if (nilai > 55 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 4) + " adalah C+");

            } else if (nilai > 40 && nilai <= 55) {
                System.out.println("Nilai mahasiswa ke-" + (i + 5) + " adalah C");

            } else if (nilai > 35 && nilai <= 40) {
                System.out.println("Nilai mahasiswa ke-" + (i + 6) + " adalah D");

            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 7) + " adalah E");
            }
            i++;
        }
 
        sc.close();
    }
}
    