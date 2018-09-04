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
                  ricerca_albero();
                  break;
              default:
                System.out.println("scelta non valida");
                break;
                  
          }
        
        }while(i!=9);
    }
    private static void stampaMenu()
    {
    System.out.println("1. inserisci ");
    System.out.println("2. ricerca");
    
    }

    private static void inserisci_albero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ricerca_albero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
