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
        System.out.println("4. Random Character");
        System.out.println("5. Bilangan Faktorial");
        System.out.println("6. Hitung Permutasi dan Kombinasi");
        System.out.println("7. Hitung Pangkat");
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
            case 4:
                /**
                * memasukkan jumlah random yang akan ditampilkan
                * memanggil method random_char dari kelas Algoritma.java
                */
                System.out.print("jumlah random : ");
                int jumlah = scp.nextInt();
                System.out.println(algo.random_char(jumlah));
                break;
            case 5:
                /**
                * Melakukan input angka yang ingin dihitung faktorialnya
                * Memanggil fungsi Faktorial
                */
                System.out.println("Masukkan angka: ");
                int n= scp.nextInt();
                System.out.println(algo.Faktorial(n));
                break;
            case 6:
                /**
                * Melakukan input nilai n dan r yang akan dihitung permutasi dan kombinasinya
                * Memanggil fungsi Permutasi dan Kombinasi
                */
                System.out.println("Masukkan n: ");
                float a= scp.nextFloat();
                System.out.println("Masukkan r: ");
                float b= scp.nextFloat();
                System.out.println("Permutasi: "+algo.Permutasi(a,b));
                System.out.println("Kombinasi: "+algo.Kombinasi(a,b));
                break;
            case 7:
                /**
                * Melakukan input bilangan beserta bilangan pangkatnya
                * Memanggil fungsi Pangkat
                */
                System.out.println("Masukkan bilangan: ");
                float x=scp.nextFloat();
                System.out.println("Masukkan pangkat: ");
                float y=scp.nextFloat();
                System.out.println("Hasil dari bil "+x+" pangkat "+y+" adalah "+algo.Pangkat(x,y));
                break;
            default:
                System.out.println("Nomor yang anda pilih tidak ada dalam menu.");
                break;
        }
    }
}
