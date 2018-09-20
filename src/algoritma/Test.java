
package algoritma;

import java.util.Scanner;

public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Algoritma algo = new Algoritma();
        //komen
        Scanner scp = new Scanner(System.in);
        int paramprima = 0;
        System.out.println("--BILANGAN PRIMA ATAU BUKAN PRIMA--");
        do
        {
            System.out.print("Enter bilangan: ");
            paramprima = scp.nextInt();
        }while(paramprima < 2);
        System.out.print(paramprima + " adalah bilangan: ");
        System.out.println(algo.isPrima(paramprima));
    }
    
}
