package dam108t2_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dam108t2e602 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Introduce un numero");
            double n1 = teclado.nextDouble();
            System.out.println("Introduce otro numero");
            double n2 = teclado.nextDouble();
            System.out.println("El resultado de la suma es " + (n1 + n2));
        } catch (InputMismatchException ex) {
            System.out.println("se han introducido valores no validos");
        }
    }
}
