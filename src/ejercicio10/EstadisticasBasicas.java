package ejercicio10;

import java.util.Scanner;

public class EstadisticasBasicas {
  static float[] numeros = new float[5];
  static float suma;

  
  public static void ingresarNumeros(){
    Scanner scanner = new Scanner(System.in);
    for(int i=0; i<numeros.length; i++){
      System.out.print("Ingrese numero " +(i+1) +": ");
      numeros[i]= scanner.nextFloat();
    }
    suma();
    scanner.close();
  }
  public static void suma(){
    for(int i=0; i<numeros.length;i++){
      suma += numeros[i];
    }
    System.out.println("La suma es " +suma);
    promedio();
  }

  public static void promedio(){
    float promedio=suma/numeros.length;
    System.out.println("El promedio es " +promedio);
    mayor();
  }

  public static void mayor(){
    float mayor=numeros[0];
      for (float f : numeros) {
        if (f>mayor) {
          mayor = f;
        }
      }
      System.out.println("El numero mayor de los 5 numeros es: " +mayor);
      menor();
    }

  public static void menor(){
    float menor=numeros[0];
      for (float f : numeros) {
        if (f<menor) {
          menor = f;
        }
      }
      System.out.println("El numero menor de los 5 numeros es: " +menor);
  }  
  public static void main(String[] args) {
    ingresarNumeros();
  }
}
