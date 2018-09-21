package algoritma;

public class Algoritma {
    
    /**
     * Fungsi untuk melakukan increment
     * @param a nilai min
     * @param b nilai maks
     * @param c nilai digit
     * @return mengembalikan String kosong
     */
    public static String increment(int a, int b, int c){
        String nol = "";
        String inc = "";
        for(int i = 0; i < c; i++){
            nol = nol + 0;
        }
        for(int i = a; i <= b; i++){
            inc = nol.substring(0,nol.length() - Integer.toString(i).length()) + Integer.toString(i);
            System.out.println(inc);
        }        
        return "";
    }
    
    /**
     * Fungsi untuk melakukan decrement
     * @param a nilai min
     * @param b nilai maks
     * @param c nilai digit
     * @return mengembalikan String kosong
     */
    public static String decrement(int a, int b, int c){
        String nol = "";
        String dec = "";
        for(int i = 0; i < c; i++){
            nol = nol + 0;
        }
        for(int i = b; i >= a; i--){
            dec = nol.substring(0,nol.length() - Integer.toString(i).length()) + Integer.toString(i);
            System.out.println(dec);
        }        
        return "";
    }
}
