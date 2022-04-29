package Ejercicios;

/**
 *
 * @author Coffee Lover
 * Ejercicio 2 - Sobrecarga de Métodos
 *  
 * Rehacer el ejercicio número 1 con las siguientes modificaciones:
    Clase promedio se le agrega el atributo prom, no tiene constructor, tiene
    el método calcularPromedio() con sobrecarga, a uno no le paso nada y
    se encarga de pedir los 4 números y al otro le debo pasar (mediante
    argumentos) los 4 números, este método debe calcular el promedio y
    guardarlo en el atributo prom y el método mostrarPromedio() que se
    encarga de mostrar el contenido del atributo prom.
    Clase Main se declara un objeto de la clase Promedio, se llama al
    método calcularPromedio() pasándole los 4 argumentos y al método
    mostrarPromedio(), luego se llama nuevamente al método
    calcularPromedio() sin pasarle los argumento y por último al método
    mostrarPromedio()
 */

public class Main {
    public static void main(String[] args) {
        Promedio firstProm = new Promedio();
        firstProm.calcularPromedio(20, 20, 20, 20);
        firstProm.mostarPromedio();
        firstProm.calcularPromedio();
        firstProm.mostarPromedio();
    }
}
