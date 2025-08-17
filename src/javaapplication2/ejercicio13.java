
package javaapplication2;

public class ejercicio13 {

    public static void main(String args[]) {
        double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
        System.out.println("Precios originales:");
        mostrarPrecios(precios,0);
        precios[3]= 150.5;
        System.out.println("Precios modificados:");
        mostrarPrecios(precios,0);
        
    }
    public static void mostrarPrecios(double[] array, int i){
        if (i >= array.length){
            return;
        }
        System.out.println("Precio: $" + array[i]);
        mostrarPrecios(array,++i);
    }
}
