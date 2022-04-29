package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author Coffee Lover
 * Ejercicio 2 - Sobrecarga de Métodos
 *  
 * Rehacer el ejercicio número 1 con las siguientes modificaciones:
    Clase promedio se le agrega el atributo prom, no tiene constructor, tiene
    el método calcularPromedio() con sobrecarga, a uno no le paso nada y
    se encarga de pedir los 4 números y al otro le debo pasar (mediante
    argumentos) los 4 números, este método debe calcular el promedio y
    guardarlo en el atributo prom y el método mostrarPromedio() que se
    encarga de mostrar el contenido del atributo prom.
    Clase Main se declara un objeto de la clase Promedio, se llama al
    método calcularPromedio() pasándole los 4 argumentos y al método
    mostrarPromedio(), luego se llama nuevamente al método
    calcularPromedio() sin pasarle los argumento y por último al método
    mostrarPromedio()
 */
public class Promedio {
    int num1, num2, num3, num4, prom;
    
//    //Metodo contructor
//    public Promedio(){
//        this.num1 = num1;
//        this.num2 = num2;
//        this.num3 = num3;
//        this.num4 = num4;
//        this.prom = prom;
//    }
   
    public void calcularPromedio(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese primer numero: ");
        num1 = input.nextInt();
        System.out.println("\nIngrese segundo numero: ");
        num2 = input.nextInt();
        System.out.println("\nIngrese tercer numero: ");
        num3 = input.nextInt();
        System.out.println("\nIngrese cuarto numero: ");
        num4 = input.nextInt();
    }
    
    public void calcularPromedio(int num1, int num2, int num3, int num4){
        prom=0;
        prom+=num1;
        prom+=num2;
        prom+=num3;
        prom+=num4;
        
        prom = prom / 4;
    }
 
    public void mostarPromedio(){
        System.out.println("El promedio de los numeros dados es de: " + prom);
    }
}
