
package javaapplication2;

import java.util.Scanner;


public class ejercicio9 {


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());
        String zona;
        do {
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            zona = input.nextLine();

            if (!zona.equalsIgnoreCase("nacional") && !zona.equalsIgnoreCase("internacional")) {
                System.out.println("Error: Zona de envío inválida. Por favor, ingrese 'Nacional' o 'Internacional'.");
            }

        } while (!zona.equalsIgnoreCase("nacional") && !zona.equalsIgnoreCase("internacional"));

        double costoEnvio = calcularCostoEnvio(peso,zona);
        System.out.println("El costo de envío es: "+costoEnvio);
        System.out.println("El total a pagar es: "+calcularTotalCompra(precio,costoEnvio));
        input.close();
    }
    public static double calcularCostoEnvio(double peso, String zona){
        double costo = 0;
        if (zona.equalsIgnoreCase("nacional")){
            costo = 5 * peso;
        }else if (zona.equalsIgnoreCase("internacional")){
             costo = 10 * peso;         
        }
        return costo;
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double total = precioProducto + costoEnvio;
        return total;
    }
}
