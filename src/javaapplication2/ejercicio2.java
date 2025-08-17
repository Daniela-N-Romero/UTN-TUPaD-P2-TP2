/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

public class ejercicio2 {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese tres números enteros a continuación.");
        System.out.print("Ingrese el primer número: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo número: ");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el tercer número: ");
        int num3 = Integer.parseInt(input.nextLine());
        
        if (num1 > num2 && num1 > num3){
            System.out.println("El mayor es "+num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("El mayor es "+num2);
        }else{
            System.out.println("El mayor es "+num3);
        }
        
    }
}
