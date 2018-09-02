/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberi;
import java.util.Scanner ;
/**
 *
 * @author dario-PD
 */
public class Alberi {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner= new Scanner ( System.in ) ;
    public static void main(String[] args) {
        // TODO code application logic here
        Albero_binario albero = new Albero_binario(); 
        int i;
        do {
          stampaMenu();
          i=scanner.nextInt();
          switch(i){
              case 1:
                  inserisci_albero();
                  break;
              case 2:
                  ricerca_aòbero();
                  break;
              default;
                System.out.println("scelta non valida");
                break;
                  
          }
        
        }while(i!=9);
    }
    
}
