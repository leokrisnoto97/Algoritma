
package algoritma;

import java.util.List;
import java.util.Scanner;

public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Algoritma algo = new Algoritma();
        Scanner scp = new Scanner(System.in);
        System.out.println("--Selamat Datang di Menu Algoritma, Silahkan Pilih Menu!--");
        System.out.println("1. Cek Bilangan Prima");
        System.out.println("2. Fibonacci Number");
        System.out.println("3. Hitung Pecahan");
        System.out.print("\nPilihan Menu: ");
        int menu = scp.nextInt();
        switch(menu){
            case 1:
                /**
                * Penggunaan Method isPrima
                */
                int paramprima = 0;
                System.out.println("\n--BILANGAN PRIMA ATAU BUKAN PRIMA--");
                do
                {
                    System.out.print("Enter bilangan: ");
                    paramprima = scp.nextInt();
                }while(paramprima < 2);
                System.out.print(paramprima + " adalah bilangan: ");
                System.out.println(algo.isPrima(paramprima));
                break;
            case 2:
                /**
                * Penggunaan Method getFibonacci
                */
                System.out.println("\n--FIBONACCI NUMBER--");
                System.out.print("Batas maksimum: ");
                int paramfibo = scp.nextInt();
                List<Integer> listFibo = algo.getFibonacci(paramfibo);
                for(int i = 0; i < listFibo.size(); i++) System.out.print(listFibo.get(i) + " ");
                System.out.println("");
                break;
            case 3:
                /**
                * Memanggil Fungsi Hitung Pecahan
                */
                System.out.println("\n-- HITUNG PECAHAN --");
                System.out.print("Masukkan nominal uang : ");
                int nominal = scp.nextInt();
                System.out.println(algo.HitungPecahan(nominal));
                break;
            default:
                System.out.println("Nomor yang anda pilih tidak ada dalam menu.");
                break;
        }
    }
}
