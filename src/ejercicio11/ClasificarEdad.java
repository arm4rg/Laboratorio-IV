package ejercicio11;

import java.util.Scanner;

public class ClasificarEdad {
  public static void ingresarEdad(){
    int edad;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese su edad: ");
    edad = scanner.nextInt();
    clasificarEdad(edad);
    scanner.close();
  }

  public static void clasificarEdad(int edad){
    if (edad>=0 && edad<=12) {
      System.out.println("Eres un nino");
    }
    else if (edad>12 && edad<=17){
      System.out.println("Eres un adolescente");
    }
    else{
      System.out.println("Eres un adulto");
    }
  }
  public static void main(String[] args) {
    System.out.println("    ***Clasificacion de Edad***");
    ingresarEdad();
  }
}
