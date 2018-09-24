package algoritma;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /**
         * @param args the command line arguments
         */
        Algoritma algo = new Algoritma();
        Scanner scp = new Scanner(System.in);
        boolean mn = false;
        do{
        System.out.println("--Selamat Datang di Menu Algoritma, Silahkan Pilih Menu!--");
        System.out.println("1. Cek Bilangan Prima");
        System.out.println("2. Fibonacci Number");
        System.out.println("3. Hitung Pecahan");
        System.out.println("4. Random Character");
        System.out.println("5. Bilangan Faktorial");
        System.out.println("6. Hitung Permutasi dan Kombinasi");
        System.out.println("7. Hitung Pangkat");
        System.out.println("8. Auto Increment");
        System.out.println("9. Auto Decrement");
        System.out.println("10. Konversi Hexadecimal dan Binary ");
        System.out.println("11. Konversi Desimal dan Oktal ");
        System.out.print("\nPilihan Menu: ");
        int menu = scp.nextInt();
        switch (menu) {
            case 1:
                /**
                 * Penggunaan Method isPrima
                 */
                int paramprima = 0;
                System.out.println("\n--BILANGAN PRIMA ATAU BUKAN PRIMA--");
                do {
                    System.out.print("Enter bilangan: ");
                    paramprima = scp.nextInt();
                } while (paramprima < 2);
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
                for (int i = 0; i < listFibo.size(); i++) {
                    System.out.print(listFibo.get(i) + " ");
                }
                System.out.println("");
                break;
            case 3:
                /**
                 * Memanggil Fungsi Hitung Pecahan
                 */
                System.out.println("\n-- HITUNG PECAHAN --");
                System.out.print("Masukkan nominal uang : ");
                int nominal = scp.nextInt();
                algo.hitungPecahan(nominal).forEach((hm) -> {
                    System.out.println(Arrays.toString(hm));
                });
                break;
            case 4:
                /**
                 * memasukkan jumlah random yang akan ditampilkan memanggil
                 * method random_char dari kelas Algoritma.java
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
                int n = scp.nextInt();
                System.out.println(algo.Faktorial(n));
                break;
            case 6:
                /**
                 * Melakukan input nilai n dan r yang akan dihitung permutasi
                 * dan kombinasinya Memanggil fungsi Permutasi dan Kombinasi
                 */
                System.out.println("Masukkan n: ");
                float a = scp.nextFloat();
                System.out.println("Masukkan r: ");
                float b = scp.nextFloat();
                System.out.println("Permutasi: " + algo.Permutasi(a, b));
                System.out.println("Kombinasi: " + algo.Kombinasi(a, b));
                break;
            case 7:
                /**
                 * Melakukan input bilangan beserta bilangan pangkatnya
                 * Memanggil fungsi Pangkat
                 */
                System.out.println("Masukkan bilangan: ");
                float x = scp.nextFloat();
                System.out.println("Masukkan pangkat: ");
                float y = scp.nextFloat();
                System.out.println("Hasil dari bil " + x + " pangkat " + y + " adalah " + algo.Pangkat(x, y));
                break;
            case 8:
                /**
                 * Memanggil fungsi Increment
                 */
                System.out.print("Minimum : ");
                int min = scp.nextInt();
                System.out.print("Maksimum : ");
                int max = scp.nextInt();
                System.out.print("Banyak Digit : ");
                int digit = scp.nextInt();
                System.out.println("--INCREMENT--");
                System.out.println(algo.increment(min, max, digit));
                break;
            case 9:
                /**
                 * Memanggil fungsi Decrement
                 */
                System.out.print("Minimum : ");
                min = scp.nextInt();
                System.out.print("Maksimum : ");
                max = scp.nextInt();
                System.out.print("Banyak Digit : ");
                digit = scp.nextInt();
                System.out.println(algo.decrement(min, max, digit));
                break;
            case 10:
                /**
                 * Untuk Memanggil Fungsi Hexadecimal to Decimal
                 */
                System.out.print("Masukkan Bilangan Hexadesimal: ");
                String hex = scp.next();
                System.out.println("\n-- Hexadecimal to Decimal --");
                System.out.println("Nilai desimal untuk angka hexadesimal " + hex+ " adalah " + algo.konversiHexadecimal(hex.toUpperCase()));

                /**
                 * Untuk Memanggil Fungsi Hexadecimal to Binary
                 */
                String result;
                System.out.println("\n-- Hexadecimal to Binary --");
                result = algo.hexToBinary(hex);
                System.out.println("Binary of " + hex + ":" + result);

                /**
                 * Untuk Memanggil Fungsi Hexadecimal to Octal
                 */
                System.out.println("\n-- Hexadecimal to Octal --");
                System.out.println("Nilai desimal untuk angka Octal " + hex + " adalah " + algo.hex2octal(hex.toUpperCase()));

                /**
                 * Untuk Memanggil Fungsi Binary to Hexadecimal
                 */
                System.out.print("Masukkan Bilangan Biner: ");
                String biner = scp.next();
                System.out.println("\n-- Binary to Hexa --");
                System.out.println("Nilai Hexa untuk bilangan Biner " + biner + " adalah " + algo.BinaryToHexadecimal(biner));

                /**
                 * Untuk Memanggil Fungsi Binary to Decimal
                 */
                System.out.println("\n-- Binary to Decimal --");
                System.out.println("Nilai Decimal: " + algo.toDecimal(Long.parseLong(biner)));

                /**
                 * Untuk Memanggil Fungsi Binary to Octal
                 */
                System.out.println("\n-- Binary to Octal --");
                System.out.println("Nilai Octal :" + algo.BinarytoOctal(biner));
                break;
            case 11:
                System.out.print("Inputkan angka Desimal : ");
                int des = scp.nextInt();

                System.out.print("Inputan to binner = ");
                System.out.println(algo.desimaltobinner(des));
                System.out.println("");
                System.out.print("Inputan to Oktal  = ");
                System.out.println(algo.desimaltookta(des));
                System.out.println("");
                System.out.print("Inputan to Heksa  = ");
                System.out.println(algo.desimaltohexa(des));
                System.out.println("");
                System.out.println("");
                System.out.print("Inputkan bilangan Oktal = ");
                String okt = scp.next();
                System.out.print("Oktal = " + okt + " to Desimal = ");
                System.out.print(algo.oktaltodesimal(okt));
                System.out.println("");
                int be = algo.oktaltodesimal(okt);
                System.out.print("Oktal = " + okt + " to Hexa = ");
                algo.oktaltohexa(be);
                System.out.println("");
                System.out.print("Oktal = " + okt + " to Binner = ");
                algo.oktaltobinner(be);
                System.out.println("");

                break;
            default:
                System.out.println("Nomor yang anda pilih tidak ada dalam menu.");
                break;
        }
            System.out.print("Kembali ke main menu(y/t): ");
            mn = scp.next().equals("y");
        }while(mn == true);
    }
}
