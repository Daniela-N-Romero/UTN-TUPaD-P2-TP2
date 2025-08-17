
package javaapplication2;


public class ejercicio12 {


    public static void main(String args[]) {
        
        double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
        System.out.println("Precios originales:");
        mostrarPrecios(precios);
        precios[3]= 150.5;
        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
        
        
    }
    public static void mostrarPrecios(double[] array){
        for (int i=0; i <array.length; i++){
            System.out.println("Precio: $"+array[i]);
        }
    }
}
