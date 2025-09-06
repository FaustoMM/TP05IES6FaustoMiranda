package ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero entre el 1 y 9 para ver su tabla: ");
        int nro = sc.nextInt();

        construirTablaDelNroIndicado(nro);

        sc.close();
    }
 
    public static void construirTablaDelNroIndicado(int e) {
        System.out.println("Tabla de Multiplicar por " + e);
        for(int i = 1; i <= 10; i++){
            System.out.println(e*i);
        }
    }
}
