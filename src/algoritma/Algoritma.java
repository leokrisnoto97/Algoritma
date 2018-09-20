/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//HIDUP TANPA CINTA, BAGAI TAMAN TAK BERBUNGA
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
     * @param bilangan inputan berupa int
     * @return Prima atau Bukan Prima berupa String
     */
    public String isPrima(int bilangan){
        String jenis = "";
        int ctr = 0;
        for(int i = 2; i <= bilangan; i++) if(bilangan % i == 0) ctr++;
        if(ctr > 1) jenis = "Bukan Prima";
        else jenis = "Prima";
        return jenis;
    }
    
    /**
     * Fibonacci number sampai angka tertentu
     * @param max batas maksimal angka fibonacci
     * @return kumpulan angka fibonacci berupa List
     */
    public List<Integer> getFibonacci(int max){
        List<Integer> numberlist = new ArrayList<>();
        numberlist.add(1);
        numberlist.add(1);
        int temp = numberlist.get(1) + numberlist.get(0);
        while(temp <= max){
            numberlist.add(temp);
            int last = numberlist.size();
            temp = numberlist.get(last - 1) + numberlist.get(last - 2);
        }
        return numberlist;
    }
    
    /**
     * Function untuk menghitung banyaknya pecahan uang berdasarkan nominal
     * @param nominal - besar nominal uang yang akan dihitung (dalam rupiah)
     * @return hasil hitung pecahan berdasarkan mata uang yang beredar
     */
    public String HitungPecahan(int nominal) {
        String[] pecahan = {"100", "200", "500", "1.000", "2.000", "5.000", "10.000", "20.000", "50.000", "100.000"};
        String hasil = "", koin = " koin Rp. ", lembar = " lembar Rp. ";
        if (nominal < 200)
            hasil = (nominal / 100) + koin + pecahan[0] + "\n";
        else if (nominal < 500)
            hasil = HitungPecahan(nominal % 200) + (nominal / 200) + koin + pecahan[1] + "\n";
        else if (nominal < 1000)
            hasil = HitungPecahan(nominal % 500) + (nominal / 500) + koin + pecahan[2] + "\n";
        else if (nominal < 2000)
            hasil = HitungPecahan(nominal % 1000) + (nominal / 1000) + lembar + pecahan[3] + "\n";
        else if (nominal < 5000)
            hasil = HitungPecahan(nominal % 2000) + (nominal / 2000) + lembar + pecahan[4] + "\n";
        else if (nominal < 10000)
            hasil = HitungPecahan(nominal % 5000) + (nominal / 5000) + lembar + pecahan[5] + "\n";
        else if (nominal < 20000)
            hasil = HitungPecahan(nominal % 10000) + (nominal / 10000) + lembar + pecahan[6] + "\n";
        else if (nominal < 50000)
            hasil = HitungPecahan(nominal % 20000) + (nominal / 20000) + lembar + pecahan[7] + "\n";
        else if (nominal < 100000)
            hasil = HitungPecahan(nominal % 50000) + (nominal / 50000) + lembar + pecahan[8] + "\n";
        else if (nominal >= 100000)
            hasil = HitungPecahan(nominal % 100000) + (nominal / 100000) + lembar + pecahan[9];
        return hasil;
    }
    
    /**
     * digunakan untuk memanggil nilai random dari karakter
     * @param jumlah digunakan untuk menampung jumlah angka yang akan di tampilkan
     * @variabel bahan digunakan untuk menyimpan karakter yang akan di random
     * @variabel randomSting digunakan untuk menyimpan hasil dari charakter yang di random
     * @return randomSting yang diisi dengan nilai random yang sudah dibentuk
     */
    public String random_char(int jumlah){
        String bahan = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String randomString = "";
        Random ob_rand = new Random();
        char[] simpan = new char[jumlah];
        for (int i = 0; i < jumlah; i++)simpan[i]=bahan.charAt(ob_rand.nextInt(bahan.length()));
        for (int i = 0; i < simpan.length; i++)randomString += simpan[i];
        return randomString;
    }
}
