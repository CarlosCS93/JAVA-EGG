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
public class Ejericio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 13
/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.*/

       String []Equipo = new String [5]; //Ejercicio 13
       Scanner leer= new Scanner(System.in);
       String n; //Ejercicio 14
        n = " ";
        System.out.println("Ingrese los nombre de los integrantes de su equipo");
        
       for (int i=0;i<5;i++){
           Equipo[i]=n=leer.nextLine();
       }
       for (int i=0;i<5;i++){
            System.out.println("Vector["+i+"]= ["+Equipo[i]+"]");
       }     
            
       int[]vector =new int [5]; //Ejemplo ingreso de datos al vector
       for (int i=0 ; i<5 ; i++){
           vector [i]=i+3;
       }
       for (int i=0;i<5;i++){
           System.out.println("Vector["+i+"]= ["+vector[i]+"]");
           
       }
            
            
            
            
       
    }
}
