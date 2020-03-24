package dam108t2_excepciones;

import java.util.Scanner;

public class dam108t2e604 {
    public static double [] arr = new double [7];
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        arr[0] = 17.5;arr[1] = 12.5;arr[2] = 14.85;arr[3] = 20;arr[4] = 7.9;arr[5] = 22.33;arr[6] = 30.01;

        try{    
            
            System.out.println("Introduce una posicion");        
            int pos1 = teclado.nextInt();
            System.out.println("Introduce segunda pocision");
            int pos2 = teclado.nextInt();
            double media = calcularMedia(pos1, pos2);
            System.out.println(media);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            
            String respuesta = ex.getMessage();
            System.out.println(respuesta);
        }
        catch(posicionDosMenorOIgual ex){
            String respuesta = ex.getMessage();
            System.out.println(respuesta);
        }
        finally{
            System.out.println("La media es 0");
        }

    }
    
    public static double calcularMedia(int p1, int p2) throws posicionDosMenorOIgual{
        if (p2 <= p1) throw new posicionDosMenorOIgual();
        else{
            double total=0;
            double media = 0;
            for (int i = p1; i < p2; i++) {
                total += arr[i];
            }
            media = total / arr.length;
            return media;            
        }

    }
    
    static class posicionDosMenorOIgual extends Exception {
        @Override
        public String getMessage(){
            return "La segunda posicion tiene que ser mayor que la primera posicion";
        }
    }
    
}
