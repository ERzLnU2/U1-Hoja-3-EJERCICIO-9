/**
   @author Daw120
   9. Pide dos números por teclado al usuario: a y b. 
      Deberá mostrarse true si ambos números son iguales y false en caso contrario.
 */
package com.solo  mongo.ejercicio9_hoja3;
import java.util.Scanner;
public class Ejercicio9_Hoja3 {
public static void main(String[] args) {      
Scanner teclado = new Scanner(System.in); // Crear objeto teclado
// Declarar variables
int na; 
int nb;
boolean resultado; 

// ENTRADA 
System.out.println("Numero a: "); na=teclado.nextInt(); 
System.out.println("Numero b: "); nb=teclado.nextInt();

// OPERACION con OPERADORES TERNARIOS
resultado=na==nb?true:false;

// SALIDA
System.out.println("Son iguales?:  "+resultado);  
    }
}
