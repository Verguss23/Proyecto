/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava;

import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author Tarde
 */
public class ProyectoJava {

    /**
     * @param args the command line arguments
     */
   static void miMetodo(String nombre, int edad) {
 System.out.println(nombre + " tiene " + edad);
 }
public static void main(String[] args) {
 // Lo que sigue es la lógica de mi aplicación
int k = 0;
do {
 System.out.println("Iteración do-while: " + k);
 k++;
}
while (k < 5);
 // Invocar varias veces el método creado al inicio
 miMetodo("Luís", 14);
 miMetodo("Martina", 16);
 miMetodo("Ángel", 35);
 miMetodo("Jenny", 25);
 miMetodo("José Antonio", 41);
}
    
}
