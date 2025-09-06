package ejercicio05;

import java.time.LocalDate;
import ejercicio05.model.Persona;

public class Main {

    public static void main(String[] args) {

        // Objeto con constructor vacio
        Persona persona1 = new Persona();

        persona1.setDni("43551233");
        persona1.setNombre("Juan");
        persona1.setFechaNacimiento(LocalDate.of(2000, 2, 21));
        persona1.setProvincia("Jujuy");

        System.out.println("Persona 1");
        persona1.mostrarDatos();

        // Objeto con constructor parametrizado
        Persona persona2 = new Persona("39654321", "Paula", LocalDate.of(1990, 1, 2), "Buenos Aires");

        System.out.println("Persona 2");
        persona2.mostrarDatos();

        // Objeto con constructor que inicializa
        Persona persona3 = new Persona("40223344", "Luis", LocalDate.of(2009, 3, 10));

        System.out.println("Persona 3");
        persona3.mostrarDatos();
    
    }
}
