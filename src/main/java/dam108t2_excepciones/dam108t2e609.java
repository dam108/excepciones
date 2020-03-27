package dam108t2_excepciones;

import java.util.Scanner;

public class dam108t2e609 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean fin = false;
        resultado2 r = new resultado2();
        _MasterMind2 juego = new _MasterMind2();
        System.out.println("[" + juego.secreto + "]");
        while (!fin) {
            try {
                System.out.printf("Introduce intento %d: ", juego.numIntento + 1);
                String intento = teclado.nextLine();
                r = juego.comprobar(intento);
                if (r.bienColocados == -1) {
                    System.out.println("Intento incorrecto");
                } else {
                    juego.pintarConsola();
                }
                if (r.gano || r.sinMasTurnos) {
                    fin = true;
                }
            } catch (wrongInputNumberEX ex) {
                System.out.println(ex.getMessage());
            } catch (notDigitEX ex){
                System.out.println(ex.getMessage());
            }
        } // fin while

        if (r.gano) {
            System.out.println("Enhorabuena. Acertaste.");
        } else {
            System.out.println("Lo sentimos. Era el " + juego.secreto);
        }
    } //main

}
