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
public class Main {
    public static void main(String[] args) {
        Promedio firstProm = new Promedio();
        firstProm.mostarPromedio(20, 500, 150, 10);
    }
}
