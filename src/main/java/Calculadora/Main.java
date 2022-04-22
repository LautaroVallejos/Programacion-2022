//Recursos
package Calculadora;
import java.util.Scanner;
/**
 * @author Coffee Lover
 */

public class Main {
    static Scanner input = new Scanner(System.in);
    public static float numA, numB;
    
    
    public static void main(String[] args) {
        //Inicializacion
        int op = 0;
        
        //Inicio del programa
        System.out.println("Inicio de la calculadora... \n");
        
        //Ingreso de los numeros  
        numA = Calculadora.setNumber1();
        numB = Calculadora.setNumber2();
        
        //Ingrso de la operacion
        System.out.println("Ingresar Operacion: \n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
        op = input.nextInt();
        
        //Logica
        switch(op){
            case 1: System.out.println("El resultado de la suma es: " + Calculadora.sumar(numA, numB));break;
            case 2: System.out.println("El resultado de la resta es: " + Calculadora.restar(numA, numB));break;
            case 3: System.out.println("El resultado de la multiplicacion es: " + Calculadora.multiplicar(numA, numB));break;
            case 4: System.out.println("El resultado de la division es: " + Calculadora.dividir(numA, numB));break;
            default: System.out.println("Error en el ingreso de la operacion, intente nuevamente");break;
        }
    }
}
 