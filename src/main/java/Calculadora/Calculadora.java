/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Coffee Lover
 */
public class Calculadora {
    
//Inicializacion
    static Scanner input = new Scanner(System.in);
    public static float numA, numB, res;
    
//Ingreso de Numeros
    public static float setNumber1(){
        System.out.println("Ingrese primer numero");
        numA = input.nextFloat();
        return numA;
    }
    
    public static float setNumber2(){
        System.out.println("Ingrese segundo numero");
        numB = input.nextFloat();
        return numB;
    }

//Funcion de Suma
    public static float sumar(float numA,float numB){
        res = numA + numB;
        return res;
    }

//Funcion de Resta
    public static float restar(float numA,float numB){
        res = numA - numB;
        return res;
    }
    
//Funcion de Multiplicacion
    public static float multiplicar(float numA,float numB){
        res = numA * numB;
        return res;
    }
    
//Funcion de Division
    public static float dividir(float numA,float numB){
        res = numA / numB;
        return res;
    }
}
