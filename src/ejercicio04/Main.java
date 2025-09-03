package ejercicio04;

public class Main {
    public static void main(String[] args) throws Exception {

        int nroA = 9;
        construirTablaDelNroIndicado(nroA);
    }
 
    public static void construirTablaDelNroIndicado(int e) {
        System.out.println("Tabla de Multiplicar por " + e);
        for(int i = 1; i <= 10; i++){
            System.out.println(e*i);
        }
    }
}
