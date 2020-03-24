package dam108t2_excepciones;

import java.util.Scanner;

public class dam108t2e601 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int res;
        
        System.out.println("Introduce un numero");        
        int n1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        int n2 = teclado.nextInt();

        try{System.out.println("El resultado de la division es "+(n1/n2));}
        catch(ArithmeticException ex){
            System.out.println("El resultado de la division es 0");
        }
    }
    
}
