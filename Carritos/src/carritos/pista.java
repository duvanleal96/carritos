/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritos;

/**
 *
 * @Duvan  Leal
 */
import java.util.Scanner;
public class pista {
    Scanner entrada= new Scanner(System.in);
    
    
    int distancia;
 public void capturarPista(){
     System.out.print(" ingrese el tamaño de la pista en kilometros : ");
      distancia = (entrada.nextInt())*1000;
 }
 
 

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
   
    
    
    
}
