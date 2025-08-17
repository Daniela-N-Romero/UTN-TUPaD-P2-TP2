
package javaapplication2;

import java.util.Scanner;


public class ejercicio4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoría del producto (A,B o C): ");
        char categoria = input.nextLine().toUpperCase().charAt(0);
        int descuento = 0;
        switch(categoria){
            case 'A':
                descuento = 10;
                break;  
            case 'B':
                descuento = 15;
                break;  
            case 'C':
                descuento = 20;
                break;  
            default:
                System.out.println("La categoría ingresada no existe.");
        }
        
//      Versión más moderna del switch:
//      switch(categoria){
//            case 'A' -> descuento = 10;
//            case 'B' -> descuento = 15;
//            case 'C' -> descuento = 20;
//            default -> System.out.println("La categoría ingresada no existe.");
//        }

        double precioFinal = precio - (precio *(double) descuento /100); 
                
        System.out.println("Descuento aplicado: "+descuento+"%");
        System.out.println("Precio final: "+precioFinal);
    }
}
