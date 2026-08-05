package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarEdad {
  public static void ingresarEdad(){
    int edad;
    Scanner scanner = new Scanner(System.in);
    boolean edadValida = false;

    while (!edadValida) {
      try {
          System.out.print("Ingrese una edad: ");
          edad = scanner.nextInt();
          validarEdad(edad);
          edadValida = true;
      } catch (InputMismatchException e) {
          System.out.println("Error, ha ingresado una cadena de texto, ingrese un numero.");
          scanner.nextLine();
      } catch(IllegalArgumentException e){
          System.out.println("Error " +e.getMessage());
      }
    }
    

    scanner.close();
  }


  public static void validarEdad(int _edad){
    if(_edad<0){
      throw new IllegalArgumentException("ha ingresado una edad negativa, ingrese una nuevamente.");
    }
    System.out.println("La edad ingresada es " +_edad +" anios.");
  }

  public static void main(String[] args) {
    ingresarEdad();
  }
}
