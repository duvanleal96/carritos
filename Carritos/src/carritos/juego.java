/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritos;

/**
 *
 * @author Duvan Leal
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class juego {

    conductor c = new conductor();
    jugador j = new jugador();
    Random r = new Random();
    pista p = new pista();
    conductor[] con;
    int primero = 0;
    int segundo = 0;
    int tercero = 0;

    Scanner entrada = new Scanner(System.in);
    List lista = new ArrayList();

    public void iniciarJuego(int numero) {
        con = new conductor[numero];
        int cont = 0;
        while(cont >= 0){
            for (int i = 0; i <= numero; i++) {
                int dado = r.nextInt(6);
                int recorrido = dado * 100;
                c.distanciaRecorrida(recorrido);
                con[i].setDistancia(recorrido);
                if (dado > primero) {
                    primero = i;
                } else if (dado > segundo) {
                    segundo = i;
                } else if (dado > tercero) {
                    tercero = i;
                }
                if (con[primero].getDistancia() <= p.getKilometros()) {
                    cont++;
                } else if (con[segundo].getDistancia() <= p.getKilometros()) {
                    cont++;
                } else if (con[tercero].getDistancia() >= p.getKilometros()) {
                    cont = -1;
                }

            }
        } 
        System.out.println("el primer lugar es el conductor " + primero);
                System.out.println("el primer lugar es el conductor " + tercero);
                        System.out.println("el primer lugar es el conductor " + tercero);
    }

    public juego() {
    }

    public void mostrarJugadores() {

    }
}
