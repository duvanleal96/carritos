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

public class conductor {

    Random r = new Random();
    int[] conductor;
   int distancia = 0;
    
    public void obtenerNumeroConductor(int conductores) {
        conductor = new int[conductores];
    }

    public void calcularDistancia(int dist) {
       this.distancia += dist;
    }

    public void distanciaRecorrida(int dis) {
        this.distancia += dis;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia += distancia;
    }

}
