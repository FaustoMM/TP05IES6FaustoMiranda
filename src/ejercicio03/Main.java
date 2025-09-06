package ejercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 0 y 10: ");
        int num = sc.nextInt();

        if (num < 0 || num > 10) {
            System.out.println("ERROR. el numero debe estar entre 0 y 10");
        } else {
            int factorial = 1;
            int i = num;

            while (i > 1) {
                factorial = factorial * i;
                i--;
            }

            System.out.println("El factorial de " + num + " es: " + factorial);
        }
        sc.close();
    }

}
