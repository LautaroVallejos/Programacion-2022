package Ejercicios;

/**
 *
 * @author Coffee Lover
 * Ejercicio 1 - Sobrecarga de Métodos
 *  
 * Realizar la clase Promedio que tiene cuatro atributos enteros (num1,
    num2, num3 y num4) su constructor que inicializa todos los atributos y el
    método mostrarPromedio() el cuál calcula el promedio de los atributos y
    los muestra. En la clase Main tiene el método main que declara un
    objeto de la clase Promedio y llama al método mostrarPromedio().
 */
public class Promedio {
    int num1, num2, num3, num4;
    
    //Metodo contructor
    public Promedio(){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }
    
    public void mostarPromedio(int num1, int num2, int num3, int num4){
        int total = 0;
        
        total+=num1;
        total+=num2;
        total+=num3;
        total+=num4;
        
        total = total/4;
        
        System.out.println("El promedio de los numeros dados es de: " + total);
    }
}
