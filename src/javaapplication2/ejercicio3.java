
package javaapplication2;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        if (edad <=0){
            System.out.println("No ingresaste una edad válida.");
        }else if (edad > 0 && edad < 12){
            System.out.println("Eres un Niño.");
        }else if (edad <= 17){
            System.out.println("Eres un Adolescente.");
        }else if (edad <= 59){
            System.out.println("Eres un Adulto.");
        }else if (edad > 59){
            System.out.println("Eres un Adulto mayor.");
        }        
    }
}