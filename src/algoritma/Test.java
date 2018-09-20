package algoritma;

import java.util.Scanner;

public class Test {
   
    public static void main(String[] args) {        
        Algoritma algo = new Algoritma();
        Scanner input = new Scanner(System.in);
        System.out.println("Inc / Dec : ");
        String pilihan = input.nextLine();
        System.out.println("Minimum : ");
        int min = input.nextInt();
        System.out.println("Maksimum : ");
        int max = input.nextInt();
        System.out.println("Banyak Digit : ");
        int digit = input.nextInt();
        
        if(pilihan.equals("Inc") || pilihan.equals("inc")){
            System.out.println(algo.increment(min,max,digit));
        }
        else if(pilihan.equals("Dec") || pilihan.equals("dec")){
            System.out.println(algo.decrement(min,max,digit));
        }
        else{
            System.out.println("Masukan pilihan Inc atau Dec");
        }
    }
}
    
