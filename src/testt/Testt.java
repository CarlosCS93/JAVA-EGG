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
        String nombree =mensaje.nextLine(); 
        
        String nombrees;
        nombrees = mensaje.nextLine();
        
        //EJERCICIO 6
        //Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
        //alguno de ellos es mayor a 25.
        
        System.out.println("Ingrese dos numero enteros");
        int nume1 = leer.nextInt();
        int nume2 = leer.nextInt();
        if (nume1 >25) {
            System.out.println("El primer numero es mayor a 25");
            
        }if (nume2>25) {
            System.out.println("El segundo numero es mayor a 25");
        }else {
            System.out.println("Los dos numeros ingresados son menores a 25");
        }        
        /*EJERCICIO 7
        Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
        que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
        permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
        o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
        o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
        gasolina”.
        o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
        hormigón”.
        o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
        alimenticia”.
        o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
        válido para tipo de bomba”*/
        

        System.out.println("FABRICA DE MOTORES CJ");
        System.out.println("Linea de motores para bombas de fluidos");
        int tipoMotor;
        System.out.println("Ingrese una opcion");
        tipoMotor=mensaje.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para el tipo de bomba");
        }
        
        
        //EJERCICIO 8
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
        //pedirá de nuevo hasta que la nota sea correcta.
        
        
            System.out.println("Ingrese una nota dentro de los parametros establecidos");
            int nota=mensaje.nextInt();
            while (nota<=0 || nota >=10 ) {
                System.out.println("Nota incorrecta, ingrese nuevamente");
                nota=mensaje.nextInt();
             
            }    
            System.out.println("Nota correctaa");    
            
            
        }
             
            
        
        
        
        
        
    }
    

