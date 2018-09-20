/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//HIDUP TANPA CINTA, BAGAI TAMAN TAK BERBUNGA
package algoritma;

import java.util.ArrayList;
import java.util.List;

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
}
