# EJERCICIO-9-Hoja-3
Entrada de datos para OPERADORES TERNARIOS con Boolean

![931](https://user-images.githubusercontent.com/80227002/192655897-5d975473-7931-43bf-9fe0-c30eb0ea1411.png)

```java
/*
 9. Pide dos números por teclado al usuario: a y b. 
      Deberá mostrarse true si ambos números son iguales y false en caso contrario.
*/
package com.solomongo.ejercicio9_hoja3;
import java.util.Scanner;
public class Ejercicio9_Hoja3 {
public static void main(String[] args) {      
Scanner teclado = new Scanner(System.in); // Crear objeto teclado
int na; 
int nb;
boolean resultado; 
System.out.println("Numero a: "); na=teclado.nextInt(); 
System.out.println("Numero b: "); nb=teclado.nextInt();
resultado=na==nb?true:false;
System.out.println("Son iguales?:  "+resultado);  
    }
}

```
![932](https://user-images.githubusercontent.com/80227002/192655908-f396d763-4a44-4555-9138-ad3ef19a269b.png)
