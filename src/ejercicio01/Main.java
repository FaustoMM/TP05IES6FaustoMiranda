package ejercicio01;

public class Main {

    public static void main(String[] args) throws Exception {
    
        // Tipos Datos Primitivos
        // Declarar Variables e Inicializar
        int numeroA = 3;
        double numeroB = 5.2;
        boolean bandera = true;
        char caracter = '$';

        // String mensaje1 = "Las Variables son: " ;
        // String mensaje2 = " que es un numero entero" ;
        // System.out.println(mensaje1+numeroA+mensaje2);

        // Declarar variables 
        String Pais = "Argentina";
        int edad = 20;
        String alturaEdificio = "9 metros";
        int precioProducto = 1200;
        String nroTelefono = "3886092600"; 

        // Sacar el coseno de 0.5
        double nrox = 0.5;
        double coseno = Math.cos(nrox);
        System.out.println("El coseno de 0.5 es: " + coseno);

        // Declarar y asignar variables
        int nro1 = 5;
        int nro2 = 10;
        int nro3 = 25;
        int nro4 = 30;
        int nro5 = 44;

        // Sacar el promedio
        int suma = nro1 + nro2 + nro3 + nro4 + nro5;
        // int promedio = suma / 5; - con esta linea se pierden los decimales del resultado
        double promedio = suma / 5.0; // de tipo double para que el resultado sea preciso

        String mensaje1 = "El Total de la suma es ";
        System.out.println(mensaje1 + suma + " y El Promedio es: " + promedio);
}


}
