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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///EJERCICIO 8
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
        //pedirá de nuevo hasta que la nota sea correcta.
        
        Scanner mensaje =new Scanner(System.in);
            System.out.println("Ingrese una nota dentro de los parametros establecidos");
            int nota=mensaje.nextInt();
            while (nota<=0 || nota >=10 ) {
                System.out.println("Nota incorrecta, ingrese nuevamente");
                nota=mensaje.nextInt();
             
            }    
            System.out.println("Nota correctaa"); 
    }
    
}
