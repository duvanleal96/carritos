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
    
    
    int recorrido;
 public void capturarPista(){
     System.out.print("ingrese el tamaño de la pista en kilometros : ");
      recorrido = entrada.nextInt();
 }
 public void obtenerPista(int distancia){
         recorrido = distancia;
    }
 

    public int getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(int recorrido) {
        this.recorrido = recorrido;
    }
   
    
    
    
}
