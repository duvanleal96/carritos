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
import javax.swing.JOptionPane;
public class pista {
    Scanner entrada= new Scanner(System.in);
    
    int kilometros;
    int recorrido;
 public void capturarPista(){
     System.out.print("ingrese el tamaño de la pista en kilometros : ");
      recorrido = entrada.nextInt();
 }
 public void obtenerPista(int distancia){
         kilometros = distancia;
    }
 
    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(int recorrido) {
        this.recorrido = recorrido;
    }
   
    
    
    
}