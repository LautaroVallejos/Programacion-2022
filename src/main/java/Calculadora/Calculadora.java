//Recursos
package Calculadora;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Coffee Lover
 */

public class Calculadora { 
//Inicializacion
    static Scanner input = new Scanner(System.in);
    public static float numA, numB, res;
    
    public void Calculadora(){
        this.numA = numA;
        this.numB = numB;
        this.res = res;
    }
    
//Ingreso de Numeros
//    public static float setNumber1(){
//        System.out.println("Ingrese primer numero");
//        numA = input.nextFloat();
//        return numA;
//    }
//    
//    public static float setNumber2(){
//        System.out.println("Ingrese segundo numero");
//        numB = input.nextFloat();
//        return numB;
//    }

//Funcion de Suma
    public static void sumar(float numA,float numB){
        res = numA + numB;
        System.out.println("El resultado de la suma es: " + res);
    }
    
    public static void sumar(){
        int op = JOptionPane.showConfirmDialog(null, "Desea ingresar numeros?");
        if(op == JOptionPane.YES_OPTION){
            System.out.println("Ingrese primer numero");
            numA = input.nextFloat();
            System.out.println("Ingrese segundo numero");
            numB = input.nextFloat();
            res = numA + numB;
            System.out.println("El resultado de la suma es: " + res);
        } else{
            System.out.println("Bueno... mi intencion no era ofenderte.\nReintenta cuando quieras.");
        }
    }

//Funcion de Resta
    public void restar(float numA,float numB){
        res = numA - numB;
        System.out.println("El resultado de la resta es: " + res);
    }
    
    public void restar(){
        int op = JOptionPane.showConfirmDialog(null, "Desea ingresar numeros?");
        if(op == JOptionPane.YES_OPTION){
            System.out.println("Ingrese primer numero");
            numA = input.nextFloat();
            System.out.println("Ingrese segundo numero");
            numB = input.nextFloat();
            res = numA - numB;
            System.out.println("El resultado de la resta es: " + res);
        } else{
            System.out.println("Bueno... mi intencion no era ofenderte.\nReintenta cuando quieras.");
        }
    }
    
//Funcion de Multiplicacion
    public void multiplicar(float numA, float numB){
        res = numA * numB;
        System.out.println("El resultado de la multiplicacion es: " + res);
    }
    
    public void multiplicar(){
        int op = JOptionPane.showConfirmDialog(null, "Desea ingresar numeros?");
        if(op == JOptionPane.YES_OPTION){
            System.out.println("Ingrese primer numero");
            numA = input.nextFloat();
            System.out.println("Ingrese segundo numero");
            numB = input.nextFloat();
            res = numA * numB;
            System.out.println("El resultado de la multiplicacion es: " + res);
        } else{
            System.out.println("Bueno... mi intencion no era ofenderte.\nReintenta cuando quieras.");
        }
    }
    
//Funcion de Division
    public void dividir(float numA,float numB){
        res = numA / numB;
        System.out.println("El resultado de la division es: " + res);
    }
    
    public void dividir(){
        int op = JOptionPane.showConfirmDialog(null, "Desea ingresar numeros?");
        if(op == JOptionPane.YES_OPTION){
            System.out.println("Ingrese primer numero");
            numA = input.nextFloat();
            System.out.println("Ingrese segundo numero");
            numB = input.nextFloat();
            res = numA / numB;
            System.out.println("El resultado de la division es: " + res);
        } else{
            System.out.println("Bueno... mi intencion no era ofenderte.\nReintenta cuando quieras.");
        }
    }
}
