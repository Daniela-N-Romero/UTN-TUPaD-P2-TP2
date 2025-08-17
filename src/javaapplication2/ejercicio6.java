package javaapplication2;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        System.out.println("Ingrese 10 números.");
        for (int i=1; i<=10;i++){
            System.out.print("Ingrese el número "+i+": ");
            num = Integer.parseInt(input.nextLine());
            if (num > 0){
                positivos++;
            }else if (num<0){
                negativos++;
            }else{
                ceros++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: "+positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println("Ceros: "+ceros);
    }
}
