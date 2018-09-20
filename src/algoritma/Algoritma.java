/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma;

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
}
