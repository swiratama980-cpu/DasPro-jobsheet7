import java.util.Scanner;

public class SiakadFor19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    double nilai;
    double tertinggi = 0, terendah = 100;

    for (int i = 1; i <= 10; i++) {
        System.out.print("Masukkan nilai ke-" + i + ": ");
       
        nilai = sc.nextDouble();

        if (nilai > tertinggi) {
            tertinggi = nilai;
  }
        if (nilai < terendah) {
            terendah = nilai;
        }
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai harus antara 0-100!");
                i--;
                continue;
        }
    }
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            
            sc.close();
    }
}