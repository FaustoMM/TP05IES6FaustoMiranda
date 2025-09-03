package ejercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Crear objeto Scanner para leer desde consola
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            int nroTriple = num * 3;
            System.out.println("El numero ingresado es par. Por lo tanto el triple del mismo es: " + nroTriple);
        } else {
            int nroDoble = num * 2;
            System.out.println("El numero ingresado es impar. Por lo tanto el doble del mismo es: " + nroDoble);
        }
        sc.close();

        //System.out.println();


    }

}
