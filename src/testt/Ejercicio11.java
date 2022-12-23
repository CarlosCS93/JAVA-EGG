/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese una frase ");
              
        String frase = leer.nextLine();
        String retorno;
         retorno = informe(frase);
      
        
         System.out.println();   
        }
        


    public static  String informe (String frase){

        int palabra =frase.length();
            System.out.println(palabra);
        String frase2 = frase;    
        
            for (int i=1;i<=palabra;i++){
            
            String pala = frase.substring((i-1),i);
            
                switch (pala) {
                    case "a":
                    
                        System.out.print("@");
                        break;
                    
                    case "e":
                        System.out.print("#");
                        break;
                    case "i":
                        System.out.print("$");
                        break;
                    case "o":
                        System.out.print("%");
                        break;
                    case "u":
                        System.out.print("*");
                        break;
                    default:
                        System.out.print(pala);
                }

            


            }
          return frase2;  
        }
}


    

    

    











