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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 ** */
        
        Scanner leer= new Scanner (System.in);
        int num ;
        
        System.out.println("Ingrese un valor comprendido entre 1 y 20");
        
        
        for (int i=0; i<4;i++){
            System.out.println();
            num=leer.nextInt();
            if (num > 0 && num < 20 ){
                System.out.print(num + " " );
            }else if (num<0 || num>20){
                System.out.println ("Numero fuera de rango entre (1-20)" );
                break;
            }
            for (int j=0; j<num;j++ ){
                System.out.print("*" + " ");
                
                
            }
        System.out.println();
    
            
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
