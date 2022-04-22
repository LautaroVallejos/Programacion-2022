//Recursos
package com.mycompany.repo;
import java.util.Scanner;
/*@author Coffee Lover*/

public class Main {
// auto es una instancia de la clase Car
// 'static' delimita que esa instancia solo se va a utilizar en esta clase
    static Car auto = new Car();
    static Car auto1 = new Car();
    static Car auto2 = new Car();
    
//Funcion Principal
    public static void main(String[] args) {
    // Se cargan los datos de los 3 objetos (autos) y Se muestran los datos de los objetos
        auto.loadData();
        auto.getData();
        
        auto1.loadData();
        auto1.getData();
        
        auto2.loadData();    
        auto2.getData();
        
        compareAge(auto, auto1, auto2);
    }
    
// Funcion que compara el modelo(año) del auto
    public static void compareAge(Car auto, Car auto1, Car auto2){
        int autoAge = auto.age;
        int auto1Age = auto1.age;
        int auto2Age = auto2.age;
        
        System.out.println("Comparando los modelos de los vehiculos por 'más reciente a menos'...");
        
        if(autoAge > auto1Age && autoAge > auto2Age){
            System.out.println("Puesto 1: ");
            auto.getData();
            if(auto1Age > auto2Age){
                System.out.println("Puesto 2: ");
                auto1.getData();
                System.out.println("Puesto 3: ");
                auto2.getData();
            } else {
                System.out.println("Puesto 2: ");
                auto2.getData();
                System.out.println("Puesto 3: ");
                auto1.getData();
            }     
        }
        
        if(auto1Age > autoAge && auto1Age > auto2Age){
            System.out.println("Puesto 1: ");
            auto1.getData();
            if(autoAge > auto2Age){
                System.out.println("Puesto 2: ");
                auto.getData();
                System.out.println("Puesto 3: ");
                auto2.getData();
            } else {
                System.out.println("Puesto 2: ");
                auto2.getData();
                System.out.println("Puesto 3: ");
                auto.getData();
            }     
        }
        
        if(auto2Age > autoAge && auto2Age > auto1Age){
            System.out.println("Puesto 1: ");
            auto2.getData();
            if(autoAge > auto1Age){
                System.out.println("Puesto 2: ");
                auto.getData();
                System.out.println("Puesto 3: ");
                auto1.getData();
            } else {
                System.out.println("Puesto 2: ");
                auto1.getData();
                System.out.println("Puesto 3: ");
                auto.getData();
            }     
        }
    }
}
