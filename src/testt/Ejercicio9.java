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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 9
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.*/

        Scanner leer= new Scanner(System.in);
        
        int  num ;
        int x=0;
        int sum=0;
        do {
            System.out.println("Ingrese un valor");
            num=leer.nextInt();
            x++;
            
            if (num>0){
                sum=sum+num;
            }else if (num<0){ //Se añade un else if para la otra condicion de numeros negativos
                
            }else       //Se añade un break para salir del bucle directamente
                break;
        } while (x<20); //puede ser con esta forma sin usar break (x<20&& num!=0)
//La forma es quitando los condicionales else if y else para escribir la condision de la linea 38 en el comentario
        if (num==0 ){
            System.out.println("Se capturo el numero 0");
            System.out.println("La suma de los valores ingresados es: " + sum);

        }else
            System.out.println("La suma de los valores ingresados es: " + sum);
                        
    }
    
}
