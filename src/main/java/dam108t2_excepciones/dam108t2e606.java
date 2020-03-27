package dam108t2_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dam108t2e606 {

    public static Scanner teclado = new Scanner(System.in);
    public static boolean validar;

    public static void main(String[] args) {
        int min = 10, max = 100, numero = 0;

        do {
            try {
                numero = leerEntero(min, max);
                if (validar) {
                    System.out.printf("El minimo es %d y el maximo es %d, tu has acertado con el numero %d", min, max, numero);
                } else {
                    System.out.println("Numero fuera de los valores de minimo y maximo");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Numero no valido");
                teclado.nextLine();
                validar = false;
            }
        } while (!validar);
    }

    public static int leerEntero(int min, int max) {
        System.out.println("Introduce un numero");
        int n = teclado.nextInt();

        if (n >= min && n <= max) {
            validar = true;
        } else {
            validar = false;
        }

        return n;
    }
}
