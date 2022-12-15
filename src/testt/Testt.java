/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;
//Funcion Scanner
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Testt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int num1=4;
        int num2=7;
        int suma=num1+num2;
        System.out.println("El resultado de la suma es = "+suma);
        //Ejercicio 4
        String nombre = "Carlos";
        int edad = 29;
        System.out.println(nombre + edad) ;
        
        //Ejemplo Scanner ingresar informacion por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Con esta clase guardamos valores ingresados por consola en las variables");
        System.out.println("Ingresa tu nombre");
        String name=leer.nextLine();
                       
        System.out.println("Ingresa tu edad");
        int edadd = leer.nextInt();
        //Ejercicio 5 Scanner
        //Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.
        System.out.println("Ingrese verdadero o falso");
        boolean var= leer.nextBoolean();
        System.out.println("Ingrese un numero decimal");
        double deci= leer.nextDouble();
        System.out.println("Ingrese un caracter");
        char letra=leer.next().charAt(0);
        //DETECCION DE ERRORES
        
        Scanner mensaje = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edaddd = mensaje.nextInt();

        System.out.println("Ingresa tu nombre");
        
        String nombrees;
        nombrees = mensaje.nextLine();
        
        //EJERCICIO 6
        //Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
        //alguno de ellos es mayor a 25.
        
        System.out.println("Ingrese dos numero enteros");
        int nume1 = leer.nextInt();
        int nume2 = leer.nextInt();
        if (nume1 >25){
            System.out.println("El primer numero es mayor a 25");
            
        }if (nume2>25){
            System.out.println("El segundo numero es mayor a 25");
        }else {
            System.out.println("Ninguno es mayor a 25");
        }        
        
                
    }
    
}
