package ejercicio12;

import java.util.Scanner;

public class MenuBasico {
  public static void menuBasico(){
    int opcion;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("    Menu");
      System.out.println("1.Sumar");
      System.out.println("2.Restar");
      opcion=scanner.nextInt();
        switch (opcion) {
          case 1:
            System.out.println("suma");
            break;

          case 2:
            System.out.println("resta");
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
  }
}
