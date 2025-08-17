
package javaapplication2;

import java.util.Scanner; 

public class ejercicio5 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sumar números pares.");
        int num;
        int suma = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            suma = (num % 2 == 0 ) ? suma + num : suma;
        } while (num != 0);
        System.out.println(suma);
    }
}
