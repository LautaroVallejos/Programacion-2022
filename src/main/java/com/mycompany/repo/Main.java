package com.mycompany.repo;
//Recursos
import java.util.Scanner;
/*@author Coffee Lover*/

/*Asunto: Vectores
    Ejercicio 1: Cargar un vector | X
    Ejercicio 2: Mostrar el vector | X
    Ejercicio 3: Mostrar el numero mayor | X
    Ejercicio 4: Mostrar el menor | X
    Ejercicio 5: Mostrar la suma de todos los numeros | X
    Ejercicio 6: Mostrar el promedio de todos los numeros | X
*/
public class Main {
    public static void main(String[] args) {
        //Declaraciones
        int num[], cant = 4, i, j, aux, mayor, menor, suma = 0;
        float prom;
        Scanner input = new Scanner(System.in);
        num = new int[cant];
        
        //Cargar el vector 
        for (i = 0; i < cant; i++) {
            System.out.println("Ingrese numero posicion " + (i+1));
            num[i] = input.nextInt();
            suma += num[i];
        }
        
        //Se setea el valor incial para compararlos
        mayor = num[0];
        menor = num[0];
        
        //Se recorre nuevamente y se comparan
        for (i = 0; i < cant; i++) {
            if(num[i] > mayor){
                mayor = num[i];
            }
            
            if(num[i] < menor){
                menor = num[i];
            }
        }
        prom = suma/cant;
        System.out.println("Los numeros ingresados en el vector son: ");
        
        //Mostrar numeros cargados en el vector
        for(i=0; i<cant ; i++){
            System.out.println(num[i]);
        }   
        
        //Mostrar el mayor
        System.out.println("El mayor numero del vector es: " + mayor);
        
        //Mostrar el menor
        System.out.println("El menor numero del vector es: " + menor);
        
        //Muestra la suma
        System.out.println("La suma de todos los numeros son: " + suma);
        
        //Muesta el promedio
        System.out.println("El promedio de todos los valores del vector es: " + prom);
        
        //Ordenar de menor a mayor
        for (i = 0; i < cant; i++) {
            for (j = i+1; j < cant; j++) {
                if(num[i] > num[j]){
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
        
        System.out.println("Vector con los elementos ordenados de menor a mayor: ");
        //Mostrar numeros cargados en el vector
        for(i=0; i<cant ; i++){
            System.out.println(num[i]);
        }
        
        //Ordenar de mayor a menor
        for (i = 0; i < cant; i++) {
            for (j = i+1; j < cant; j++) {
                if(num[i] < num[j]){
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
        
        System.out.println("Vector con los elementos ordenados de mayor a menor: ");
        //Mostrar numeros cargados en el vector
        for(i=0; i<cant ; i++){
            System.out.println(num[i]);
        }
        
    }
}
