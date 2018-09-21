/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author chochong
 */
public class Algoritma {

    /**
     * Cek bilangan Prima atau Bukan Prima
     *
     * @param bilangan inputan berupa int
     * @return Prima atau Bukan Prima berupa String
     */
    public String isPrima(int bilangan) {
        String jenis = "";
        int ctr = 0;
        for (int i = 2; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                ctr++;
            }
        }
        if (ctr > 1) {
            jenis = "Bukan Prima";
        } else {
            jenis = "Prima";
        }
        return jenis;
    }

    /**
     * Fibonacci number sampai angka tertentu
     *
     * @param max batas maksimal angka fibonacci
     * @return kumpulan angka fibonacci berupa List
     */
    public List<Integer> getFibonacci(int max) {
        List<Integer> numberlist = new ArrayList<>();
        numberlist.add(1);
        numberlist.add(1);
        int temp = numberlist.get(1) + numberlist.get(0);
        while (temp <= max) {
            numberlist.add(temp);
            int last = numberlist.size();
            temp = numberlist.get(last - 1) + numberlist.get(last - 2);
        }
        return numberlist;
    }

    /**
     * Function untuk menghitung banyaknya pecahan uang berdasarkan nominal
     *
     * @param nominal - besar nominal uang yang akan dihitung (dalam rupiah)
     * @return hasil hitung pecahan berdasarkan mata uang yang beredar
     */
    public String HitungPecahan(int nominal) {
        String[] pecahan = {"100", "200", "500", "1.000", "2.000", "5.000", "10.000", "20.000", "50.000", "100.000"};
        String hasil = "", koin = " koin Rp. ", lembar = " lembar Rp. ";
        if (nominal < 200) {
            hasil = (nominal / 100) + koin + pecahan[0] + "\n";
        } else if (nominal < 500) {
            hasil = HitungPecahan(nominal % 200) + (nominal / 200) + koin + pecahan[1] + "\n";
        } else if (nominal < 1000) {
            hasil = HitungPecahan(nominal % 500) + (nominal / 500) + koin + pecahan[2] + "\n";
        } else if (nominal < 2000) {
            hasil = HitungPecahan(nominal % 1000) + (nominal / 1000) + lembar + pecahan[3] + "\n";
        } else if (nominal < 5000) {
            hasil = HitungPecahan(nominal % 2000) + (nominal / 2000) + lembar + pecahan[4] + "\n";
        } else if (nominal < 10000) {
            hasil = HitungPecahan(nominal % 5000) + (nominal / 5000) + lembar + pecahan[5] + "\n";
        } else if (nominal < 20000) {
            hasil = HitungPecahan(nominal % 10000) + (nominal / 10000) + lembar + pecahan[6] + "\n";
        } else if (nominal < 50000) {
            hasil = HitungPecahan(nominal % 20000) + (nominal / 20000) + lembar + pecahan[7] + "\n";
        } else if (nominal < 100000) {
            hasil = HitungPecahan(nominal % 50000) + (nominal / 50000) + lembar + pecahan[8] + "\n";
        } else if (nominal >= 100000) {
            hasil = HitungPecahan(nominal % 100000) + (nominal / 100000) + lembar + pecahan[9];
        }
        return hasil;
    }

    /**
     * digunakan untuk memanggil nilai random dari karakter
     *
     * @param jumlah digunakan untuk menampung jumlah angka yang akan di
     * tampilkan
     * @variabel bahan digunakan untuk menyimpan karakter yang akan di random
     * @variabel randomSting digunakan untuk menyimpan hasil dari charakter yang
     * di random
     * @return randomSting yang diisi dengan nilai random yang sudah dibentuk
     */
    public String random_char(int jumlah) {
        String bahan = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String randomString = "";
        Random ob_rand = new Random();
        char[] simpan = new char[jumlah];
        for (int i = 0; i < jumlah; i++) {
            simpan[i] = bahan.charAt(ob_rand.nextInt(bahan.length()));
        }
        for (int i = 0; i < simpan.length; i++) {
            randomString += simpan[i];
        }
        return randomString;
    }

    /**
     * Fungsi untuk menghitung faktorial
     *
     * @param n bilangan yang nantinya akan dicari faktorialnya
     * @return x hasil faktorial dari bilangan n
     */
    public int Faktorial(int n) {
        int x = 1, i;
        for (i = n; i >= 1; i--) {
            x *= i;
        }
        return x;
    }

    /**
     * Fungsi untuk menghitung permutasi berdasarkan 2 bilangan yg sudah
     * dimasukkan
     *
     * @param a bilangan sebagai nilai n
     * @param b bilangan sebagai nilai r
     * @return hasil merupakan hasil dari hitungan permutasi
     */
    public float Permutasi(float a, float b) {
        float n=Faktorial((int) a);
        float j=(a-b);
        float nr=Faktorial((int) j);
        float hasil=n/nr;
        return hasil;
    }

    /**
     * Fungsi untuk menghitung kombinasi berdasarkan 2 bilangan yg sudah
     * dimasukkan
     *
     * @param a bilangan sebagai nilai n
     * @param b bilangan sebagai nilai r
     * @return hasil merupakan hasil dari hitungan kombinasi
     */
    public float Kombinasi(float a, float b) {
        float n=Faktorial((int) a);
        float r=Faktorial((int) b);
        float k = a-b;
        float nr=Faktorial((int) k);        
        float hasil=n/(r*nr);
        return hasil;
    }

    /**
     * Fungsi untuk menghitung bilangan berpangkat
     *
     * @param x sebagai bilangan utama
     * @param y sebagai pangkat
     * @return hasil merupakan hasil perhitungan perpangkatan
     */
    public float Pangkat(float x, float y) {
        float hasil = x;
        int i;
        if (y == 0) {
            hasil = 1;
            return hasil;
        } else if (y > 0) {
            for (i = 1; i < y; i++) {
                hasil *= x;
            }
            return hasil;
        } else {
            for (i = 1; i < y * -1; i++) {
                hasil *= x;
            }
        }
        hasil = 1 / hasil;
        return hasil;
    }

    /**
     * Fungsi untuk melakukan increment
     *
     * @param a nilai min
     * @param b nilai maks
     * @param c nilai digit
     * @return mengembalikan String kosong
     */
    public static String increment(int a, int b, int c) {
        String nol = "";
        String inc = "";
        for (int i = 0; i < c; i++) {
            nol = nol + 0;
        }
        for (int i = a; i <= b; i++) {
            inc = nol.substring(0, nol.length() - Integer.toString(i).length()) + Integer.toString(i);
            System.out.println(inc);
        }
        return "";
    }

    /**
     * Fungsi untuk melakukan decrement
     *
     * @param a nilai min
     * @param b nilai maks
     * @param c nilai digit
     * @return mengembalikan String kosong
     */
    public static String decrement(int a, int b, int c) {
        String nol = "";
        String dec = "";
        for (int i = 0; i < c; i++) {
            nol = nol + 0;
        }
        for (int i = b; i >= a; i--) {
            dec = nol.substring(0, nol.length() - Integer.toString(i).length()) + Integer.toString(i);
            System.out.println(dec);
        }
        return "";
    }

    /**
     * Deka
     * Konversi Hexadecimal to Decimal
     * @param hex untuk program akan mengembalikan nilai integer.
     * @return nilaidesimal untuk menampilkan nilai desimal, ch - '0' untuk -
     * mengembalikan nilai desimal untuk hex character. Character dapat sebagai
     * uppercase ataupun lowercase.
     */
    public int konversiHexadecimal(String hex) {
        int nilaiDesimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            nilaiDesimal = nilaiDesimal * 16 + hexCharKeDesimal(hexChar);
        }
        return nilaiDesimal;
    }

    /**
     * Konversi String Hex ke Decimal hexCharkeDesimal ini akan di gunakan oleh
     * konversiHexadecimal nantinya
     *
     * @param ch sebagai menanda batas angka
     * @return untuk mengembalikan nilai decimal untuk hex character
     */
    public static int hexCharKeDesimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else // ch adalah '0', '1', ..., atau '9'  
        {
            return ch - '0';
        }
    }

    /**
     * Konversi Hexadecimal to Binary
     *
     * @param hex untuk mengambil data Hexa untuk di convertkan ke binary
     * @return mengembalikan data hasil dari binary value
     */
    public String hexToBinary(String hex) {
        String result = "";
        String binVal;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            switch (hexChar) {
                case ('0'):
                    binVal = "0000";
                    break;
                case ('1'):
                    binVal = "0001";
                    break;
                case ('2'):
                    binVal = "0010";
                    break;
                case ('3'):
                    binVal = "0011";
                    break;
                case ('4'):
                    binVal = "0100";
                    break;
                case ('5'):
                    binVal = "0101";
                    break;
                case ('6'):
                    binVal = "0110";
                    break;
                case ('7'):
                    binVal = "0111";
                    break;
                case ('8'):
                    binVal = "1000";
                    break;
                case ('9'):
                    binVal = "1001";
                    break;
                case ('A'):
                    binVal = "1010";
                    break;
                case ('B'):
                    binVal = "1011";
                    break;
                case ('C'):
                    binVal = "1100";
                    break;
                case ('D'):
                    binVal = "1101";
                    break;
                case ('E'):
                    binVal = "1110";
                    break;
                case ('F'):
                    binVal = "1111";
                    break;
                default:
                    binVal = "invalid input";
                    break;
            }
            result += binVal;
        }
        return result;
    }

    /**
     *
     * @param OctalNumber
     * @return
     */
    public int hex2octal(String nilaihex) {
     String a = hexToBinary(nilaihex);
       int b = BinarytoOctal(Integer.parseInt(a));
       
//int counter = 0;
        //int result = 0;
        //while (OctalNumber != 0) {
          //  int temp = (int) ((OctalNumber % 8) * Math.pow(10, counter));
            //counter++;
           // result += temp;
            //OctalNumber /= 8;
       // }
       return b;
    }

    /**
     * Konversi Hexa to Decimal
     *
     * @param s untuk mengisi data hexa
     * @return mengembalikan value decimal
     */
    public int hex2decimal(String s) {
        String digits = "";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    /**
     * Konversi dari Binary ke Hexadecimal
     *
     * @param number berisi bilangan yang akan di konversikan
     * @return mengembalikan nilai hexa
     */
    public String BinaryToHexadecimal(String number) {
        String hexa = "";
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
            'b', 'c', 'd', 'e', 'f'};
        if (number != null && !number.isEmpty()) {
            int decimal = BinaryToDecimal(number);
            while (decimal > 0) {
                hexa = hex[decimal % 16] + hexa;
                decimal /= 16;
            }
        }
        return hexa;
    }

    /**
     * Konversi Biner ke Decimal
     *
     * @param number Isi dari Bilangan Biner
     * @return Mengembalikan hasil konversi biner ke decimal
     */
    public int BinaryToDecimal(String number) {
        int length = number.length() - 1;
        int decimal = 0;
        if (isBinary(number)) {
            char[] digits = number.toCharArray();
            for (char digit : digits) {
                if (String.valueOf(digit).equals("1")) {
                    decimal += Math.pow(2, length);
                }
                --length;
            }
        }
        return decimal;
    }

    /**
     * Untuk kondisi apakah Bilangan yang di input merupakan bilangan
     * Biner/Binary
     *
     * @param number berisi bilangan yang di input
     * @return mengembalikan data biner
     */
    public boolean isBinary(String number) {
        boolean isBinary = false;
        if (number != null && !number.isEmpty()) {
            long num = Long.parseLong(number);
            while (num > 0) {
                if (num % 10 <= 1) {
                    isBinary = true;
                } else {
                    isBinary = false;
                    break;
                }
                num /= 10;
            }
        }
        return isBinary;
    }

    /**
     * Konversi Binary to Decimal
     *
     * @param binary mengambil data Binary
     * @return untuk mengembalikan data decimal
     */
    public int toDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }

    /**
     * Untuk Mengkonversikan Binary ke Octal
     *
     * @param angkabiner di isi oleh bilangan biner yang akan di konversikan
     * @return mengembalikan data bilangan octal
     */
    public int BinarytoOctal(int angkabiner) {
        int angkaoctal = 0, angkadecimal = 0, i = 0;
        while (angkabiner != 0) {
            angkadecimal += (angkabiner % 10) * Math.pow(2, i);
            ++i;
            angkabiner /= 10;
        }
        i = 1;
        while (angkadecimal != 0) {
            angkaoctal += (angkadecimal % 8) * i;
            angkadecimal /= 8;
            i *= 10;
        }
        return angkaoctal;
    }
    /**
     * des2bin
     *
     * @param a untuk menambil inputan angka desimal
     * @return
     */
    public int desimaltobinner(int a) {
        if (a > 1) {
            desimaltobinner(a / 2);
        }
        System.out.print(a % 2);
        return 0;
    }

    /**
     * des2okt
     *
     * @param a untuk mengambil inputan angka desimal
     * @return
     */
    public int desimaltookta(int a) {
        char[] daftarOktal = {'0', '1', '2', '3', '4', '5', '6', '7'};
        if (a > 0) {
            desimaltookta(a / 8);
            System.out.print(daftarOktal[a % 8]);
        }
        return 0;
    }

    /**
     * des2hex
     *
     * @param n untuk mengambil inputan angka desimal
     * @return
     */
    public int desimaltohexa(int n) {
        char[] daftarHexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (n > 0) {
            desimaltohexa(n / 16);
            System.out.print(daftarHexa[n % 16]);
        }
        return 0;
    }

    /**
     * okt2des
     *
     * @param okt mengambil inputan dari oktal yang dicaba berupa karakter untuk
     * di konversi ke integer
     * @return
     */
    public int oktaltodesimal(String okt) {
        int nilaiDesimal = 0;
        for (int i = 0; i < okt.length(); i++) {
            char hexChar = okt.charAt(i);
            nilaiDesimal = nilaiDesimal * 8 + oktalkedesimal(hexChar);
        }
        return nilaiDesimal;
    }

    /**
     * Method untuk mengembalikan nilai desimal dari hex character
     */
    /**
     * okt2desi
     *
     * @param ch untuk mengambil dan membaca inputan berupa karakter
     * @return
     */
    public int oktalkedesimal(char ch) {
        if (ch >= '7') {
            return 8 + ch - '8';
        } else // ch adalah '0', '1', ..., atau '9'  
        {
            return ch - '0';
        }
    }

    /**
     * okt2hex
     *
     * @param n untuk mengambil inputan dari hasil konversi oktal ke desimal
     * @return
     */
    public int oktaltohexa(int n) {
        char[] daftarHexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (n > 0) {
            oktaltohexa(n / 16);
            System.out.print(daftarHexa[n % 16]);
        }
        return 0;
    }

    /**
     * okt2bin
     *
     * @param a untuk mengambil data hasil dari konversi oktal to desimal
     * @return
     */
    public int oktaltobinner(int a) {
        if (a > 1) {
            oktaltobinner(a / 2);
        }
        System.out.print(a % 2);
        return 0;
    }

}
