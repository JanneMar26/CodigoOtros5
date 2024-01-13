package com.generation; // Genere el paquete eclipse

import java.util.Scanner; // Importe la clase Scanner

public class Codigo5 {
	
	public static void main(String[] args) { // Neesitamos un método principal

    Scanner s = new Scanner(System.in); // Agregamos System.in para la entrada de datos
    System.out.print("Introduzca un número: "); // Cambio de comillas para solicitar al usuario que ingrese el dato
    int ni = s.nextInt(); // necesitamos un interger no linea que leea el número ingresado
    int c = ni;
    
    int afo = 0; // contadores
    int noAfo = 0;
    
    while (ni > 0) {
	  int digito = ni % 10;
      if (digito == 3 || digito == 7 || digito == 8 || digito == 9) { // quite parentesis inecesarios
		afo++;
      } else {
		noAfo++;
	  
    }
      ni /= 10; // lo movi fuera del ciclo
    }

    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado."); // Le falta una letra "t" al print
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    
    s.close(); // Para cerrar el Scanner 
  }
}

