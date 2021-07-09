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
import java.io.FileWriter;
import java.io.IOException;
public class Inicio {

    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        
        FileWriter fichero = new FileWriter ("C:/Users/Usuario/Downloads/Ganadores.txt");
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
        System.out.println("el numero de jugadores es : "+ c.getNumb());
        juego j= new juego();
        System.out.println("la cantidad de carriles es "+ c.getNumb());
        System.out.println("la cantidad de autos es "+ c.getNumb());
        j.iniciarJuego(c.getNumb());
        fichero.write("primer puesto : "+j.getPrimero()+"\n"+"segundo puesto : "+j.getSegundo()+"\n"+"tercer puesto : "+j.getTercero());
        fichero.close();
    }

}
