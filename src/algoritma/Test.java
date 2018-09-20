package algoritma;

import java.util.List;
import java.util.Scanner;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Algoritma algo = new Algoritma();
        //komen

        /**
         * Penggunaan Method isPrima
         */
        Scanner scp = new Scanner(System.in);
        int paramprima = 0;
        System.out.println("\n--BILANGAN PRIMA ATAU BUKAN PRIMA--");
        do {
            System.out.print("Enter bilangan: ");
            paramprima = scp.nextInt();
        } while (paramprima < 2);
        System.out.print(paramprima + " adalah bilangan: ");
        System.out.println(algo.isPrima(paramprima));

        /**
         * Penggunaan Method getFibonacci
         */
        System.out.println("\n--FIBONACCI NUMBER--");
        System.out.print("Batas maksimum: ");
        int paramfibo = scp.nextInt();
        List<Integer> listFibo = algo.getFibonacci(paramfibo);
        for (int i = 0; i < listFibo.size(); i++) {
            System.out.print(listFibo.get(i) + " ");
        }
        System.out.println("");

        /**
         * Memanggil Fungsi Hitung Pecahan
         */
        System.out.println("\n-- HITUNG PECAHAN --");
        System.out.print("Masukkan nominal uang : ");
        int nominal = scp.nextInt();
        System.out.println(algo.HitungPecahan(nominal));

        /**
         * memasukkan jumlah random yang akan ditampilkan
         * memanggil method random_char dari kelas Algoritma.java
         */
        System.out.print("jumlah random : ");
        int jumlah = scp.nextInt();
        System.out.println(algo.random_char(jumlah));

    }

}
