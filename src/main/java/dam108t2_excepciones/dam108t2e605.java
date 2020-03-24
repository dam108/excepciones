package dam108t2_excepciones;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class dam108t2e605 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia,mes,year;
        LocalDate fecha;
        boolean mostrar;
        
        try {
            System.out.println("Introduce un dia");
            dia = teclado.nextInt();
            System.out.println("Introduce un mes");
            mes = teclado.nextInt();
            System.out.println("Introduce un año");
            year = teclado.nextInt();

            mostrar = validarFecha(dia, mes, year);
            
            if (mostrar) System.out.println("fecha valida");

        } catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
            System.out.println("Introduce los datos correctamente");
        }
    }
    
    public static boolean validarFecha(int d, int m, int a){
        try {
            LocalDate.of(a,m, d);
            return true;
            
        } catch (DateTimeException ex){
            System.out.println(ex.getMessage());
            System.out.println("fecha no valida");
            return false;
        }

    }
    
}