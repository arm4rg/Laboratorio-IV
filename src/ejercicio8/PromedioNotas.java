package ejercicio8;

import java.util.Scanner;

public class PromedioNotas {
  static float[] notas = new float[5];

  public static void promedio(){
    float sumaNotas=0, promedio=0;
    for(int i=0; i<notas.length; i++){
      sumaNotas += notas[i];
    }
    promedio = sumaNotas/notas.length;
    System.out.println("El promedio de las 5 notas es " +promedio);
  }

  public static void llenarArreglo(){
    Scanner scanner = new Scanner(System.in);
    for(int i=0; i<notas.length; i++){
      System.out.print("Ingrese nota " +(i+1) +": ");
      notas[i] = scanner.nextFloat();
    }
    promedio();
    scanner.close();
  }

  public static void main(String[] args) {
    System.out.println("    ***Ejercicio 8 Promedio de Notas***");
    llenarArreglo();
  }
}
