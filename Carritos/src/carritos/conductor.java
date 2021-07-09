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

public class conductor {

    int []conductor;
    int distancia=0;

    public void obtenerNumeroConductor(int conductores) {
        conductor = new int [conductores];
    }
    
    public void distanciaRecorrida(int dis){
        distancia += dis;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia += distancia;
    }

}
