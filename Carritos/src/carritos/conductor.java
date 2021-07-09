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
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class conductor {

    Scanner entrada = new Scanner(System.in);
    Random r = new Random();
    int[] conductor;
    int distancia=0;
    String nombre;
    public void obtenerNumeroConductor(int conductores) {
        conductor = new int[conductores];
    }

    public void calcularDistancia(int dist) {
        this.distancia = dist;
    }

    public void nombreJugadores(int numero) {
        for(int i=1;i<numero;i++){
        System.out.println("ingrese el nombre del jugador " + i);
        nombre=entrada.next();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia += distancia;
    }

}
