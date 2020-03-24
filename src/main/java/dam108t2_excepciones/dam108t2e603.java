package dam108t2_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dam108t2e603 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String respuesta;
        try {
            System.out.println("Introduce un numero");
            int n1 = teclado.nextInt();
            System.out.println("Introduce otro numero");
            int n2 = teclado.nextInt();
            System.out.println("El resultado de la division es " + (n1 / n2));

        } catch (ArithmeticException ex) {
            respuesta = ex.getMessage();
            System.out.println(respuesta);
        } catch (InputMismatchException ex){
            respuesta = ex.getMessage();
            System.out.println(respuesta);
        } finally {
            System.out.println("El resultado de la division es 0");
        }
    }

}
