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
public class carril {
    
    int[] carril;
    int numb;
    Scanner entrada = new Scanner(System.in);

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }
    
   public void carriles(int carriles){
       carril= new int[carriles];
   }
   
   public void capturarCarriles(){
       System.out.println("digite la cantidad de carriles : ");
        numb = entrada.nextInt();
   }
           
    
}
