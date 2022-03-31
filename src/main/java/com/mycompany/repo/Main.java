package com.mycompany.repo;
//Recursos
import java.util.Scanner;
/*@author Coffee Lover*/

/*Asunto: Vectores
    Ejercicio 1: Cargar un vector | X
    Ejercicio 2: Mostrar el vector | X
    Ejercicio 3: Mostrar el numero mayor | sin completar
    Ejercicio 4: Mostrar el menor | sin completar
    Ejercicio 5: Mostrar la suma de todos los numeros | sin completar
    Ejercicio 6: Mostrar el promedio de todos los numeros | sin completar 
*/
public class Main {
    public static void main(String[] args) {
        //Declaraciones
        int num[], cant = 9, i;
        Scanner input = new Scanner(System.in);
        num = new int[cant];
        
        //Cargar el vector
        for (i = 0; i < cant; i++) {
            System.out.println("Ingrese numero posicion " + (i+1));
            num[i] = input.nextInt();
        }
        
        //Mostrar numeros cargados en el vector
        for(i=0; i<cant ; i++){
            System.out.println(num[i]);
        }
    }
}
