
package javaapplication2;

import java.util.Scanner;


public class ejercicio8 {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje(Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(input.nextLine());
        System.out.println("El precio final del producto es: "+calcularPrecioFinal(precioBase, impuesto,descuento));
        
    }
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal = precioBase + (precioBase * (impuesto/100)) - (precioBase*(descuento/100));
        return precioFinal;
    }
}
