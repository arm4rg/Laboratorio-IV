package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
  static Scanner scanner = new Scanner(System.in);
  public static void ingresarNumeros(){
    float dividendo=0f, divisor=0f;
    boolean dividendoValido = false;
    boolean divisorValido = false;

      while(!dividendoValido){
      try {
        System.out.print("Ingrese dividendo:");
        dividendo = scanner.nextFloat();

        dividendoValido = true;    //Hace true la variable booleana y rompe el ciclo while

      } catch (InputMismatchException e) {
        System.out.println("Error ha ingresado una cadena de texto en lugar de un numero");
        scanner.nextLine();   //Limpia el buffer de lo contrario se crea un bucle infinito con cadena invalida
      } catch (ArithmeticException e){
        System.out.println(e.getMessage());
      }
      } 

      while(!divisorValido){
      try {
        System.out.print("Ingrese divisor:");
        divisor = scanner.nextFloat();

        divisorValido = true;    //Hace true la variable booleana y rompe el ciclo while

      } catch (InputMismatchException e) {
        System.out.println("Error ha ingresado una cadena de texto en lugar de un numero");
        scanner.nextLine();   //Limpia el buffer de lo contrario se crea un bucle infinito con cadena invalida
      } catch (ArithmeticException e){
        System.out.println(e.getMessage());
      }
      } 

      try {
        divisionSegura(dividendo, divisor);
      } catch (ArithmeticException e) {
       System.out.println(e.getMessage()); 
      }
      

    }

  public static void divisionSegura(float dividendo, float divisor){
      if (divisor==0) {
      throw new ArithmeticException("La division no puede realizarse debido a que el divisor ingresado es 0");
      }
      realizarDivision(dividendo,divisor);
   
  }

  public static void realizarDivision(float dividendo, float divisor){
    float resultado= dividendo/divisor;
    
    System.out.println("El resultado es " +resultado);
  }
  public static void main(String[] args) {
    ingresarNumeros();
    scanner.close();
  }
}
