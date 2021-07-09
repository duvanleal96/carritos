/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritos;

/**
 *
 * @author Duvan leal
 */
import java.util.Scanner;

public class Inicio {

    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        pista p = new pista();
        carril c = new carril();
        c.capturarCarriles();
        conductor con = new conductor();
        carro car = new carro();
        jugador jug = new jugador();
        c.carriles(c.getNumb());
        con.obtenerNumeroConductor(c.getNumb());
        car.carro(c.getNumb());
        jug.jugadores(c.getNumb());
        System.out.println("el numero de jugadores es :"+ c.getNumb());
        juego j= new juego();
        j.iniciarJuego(c.getNumb());
        
    }

}
