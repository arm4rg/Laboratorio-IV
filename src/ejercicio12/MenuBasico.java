package ejercicio12;

import java.util.Scanner;

public class MenuBasico {
  static float num1, num2;
  static Scanner scanner = new Scanner(System.in);

  public static void ingresarNumeros(){
    System.out.print("Ingrese numero 1: ");
    num1 = scanner.nextFloat();
    System.out.print("Ingrese numero 2: ");
    num2 = scanner.nextFloat();
  }

  public static void sumar(){
    ingresarNumeros();
    System.out.println("    ***Sumar 2 numeros***");
    float suma = num1 + num2;
    System.out.println("El resultado de " +num1 +"+" +num2 +" es " +suma);
  }

  public static void restar(){
    ingresarNumeros();
    System.out.println("    ***Restar 2 numeros***");
    float resta = num1 - num2;
    System.out.println("El resultado de " +num1 +"-" +num2 +" es " +resta);
  }

  public static void menuBasico(){
    int opcion;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("    Menu");
      System.out.println("1.Sumar");
      System.out.println("2.Restar");
      System.out.println("3.Salir");
      System.out.print("Ingrese una opcion: ");
      opcion=scanner.nextInt();
        switch (opcion) {
          case 1:
            sumar();
            break;

          case 2:
            restar();
            break;

          case 3:
            System.out.println("Saliendo del programa");
            break;
        
          default:
            System.out.println("Ha ingresado una opcion invalida, ingrese una nuevamente.");
            break;
        }

    } while (opcion !=3);
    scanner.close();
  }

  public static void main(String[] args) {
    menuBasico();
    scanner.close();
  }
}
