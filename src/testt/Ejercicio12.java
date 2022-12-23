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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 =leer.nextInt();
        int num3 = num%num2;
        if (num3==0){
            System.out.println("El primer numero si es multiplo del segundo");
        } else
            System.out.println("El primer numero no es multiplo del segundo");
        
        
    }    
    
    public static void EsMultiplo(int num, int num2){
        
        System.out.println("El primer numero");
        
        
    }
    
    
    
    
}
