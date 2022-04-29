//Recursos
package Calculadora;
import java.util.Scanner;
/**
 * @author Coffee Lover
 */

public class Main {
    static Scanner input = new Scanner(System.in);
    static Calculadora operacion = new Calculadora();
    public static float numA, numB;
       
    public static void main(String[] args) {
        //Inicializacion
        int op = 0;
        
        //Inicio del programa
        System.out.println("Inicio de la calculadora... \n");
        
        //Ingrso de la operacion
        System.out.println("Ingresar Operacion: \n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
        op = input.nextInt();
        
        //Logica
        switch(op){
            case 1: operacion.sumar(2, 45); operacion.sumar();break;
            case 2: operacion.restar(50, 20); operacion.restar();break;
            case 3: operacion.multiplicar(2, 10); operacion.multiplicar();break;
            case 4: operacion.dividir(30, 5); operacion.dividir();break;
            default: System.out.println("Error en el ingreso de la operacion, intente nuevamente");break;
        }
    }
}
 