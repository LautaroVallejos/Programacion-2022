package com.mycompany.repo;
import java.util.Scanner;
/**
 *
 * @author Coffee Lover
 */
public class Car {
    int id;
    String name;
    float price;
    String model;
    int age;
    
    Scanner input = new Scanner(System.in);
    
    public void loadData(){
    //Ingresa Nombre
        System.out.println("Ingrese el id del vehiculo: ");
        id = input.nextInt();
        
    //Ingresa Marca y Limpia el buffer (no se por que)
        System.out.println("Ingrese marca del vehiculo: ");
        input.nextLine();
        name = input.nextLine();
        
    //Ingresa Precio
        System.out.println("Ingrese el precio del vehiculo: ");
        price = input.nextFloat();
        
    //Ingresa Modelo
        System.out.println("Ingrese modelo del vehiculo: ");
        input.nextLine();
        model = input.nextLine(); 
        //input.nextLine();
        
    //Ingresa año
        System.out.println("Ingrese año del vehiculo: ");
        age = input.nextInt();
    }
    
    public void getData(){
    //Informa el valor del objeto
        System.out.println("El id del vehiculo es: " + id);
        System.out.println("La marca del vehiculo es: " + name);
        System.out.println("El precio del vehiculo es: " + price);
        System.out.println("El modelo del vehiculo es: " + model);
        System.out.println("El año del vehiculo es: " + age);
    }
}
