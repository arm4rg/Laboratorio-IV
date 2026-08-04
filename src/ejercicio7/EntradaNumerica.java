package ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaNumerica {
  public static void ingresarNumero(){
    //Variables que se usaran para la validacion
    boolean numeroValido = false;                           //Ayuda a crear un ciclo que se repite hasta que se ingresa un numero
    float numero=0;                                         //Es tipo float ya que si ingresa un numero con decimales es valido
    Scanner sc = new Scanner(System.in);                    //Objeto escaner para ingresar datos por consola
    System.out.println("Ejercicio 7 Entrada Numerica");

    //inicio del bucle, ingresa con un valor falso y se ejecuta hasta obtener verdadero
    while (!numeroValido) {
      try {
        System.out.print("Ingrese un numero: ");
        numero = sc.nextFloat();  
        numeroValido = true;                              //Si el numero ingresado es valido entonces la variable es true y el ciclo termina
      } catch (InputMismatchException e) {                //Captura el tipo InputMismatchException (una cadena en lugar de numero)
      System.out.println("Ha ocurrido un error, ha ingresado una cadena de texto en lugar de un numero.");
      System.out.println("Ingrese otro numero nuevamente.");
      sc.nextLine();                                      //Limpia el buffer de lo contrario ocurre un bucle infinito sin poder ingresar nada
      }
    }
    System.out.println("El numero " +numero +" es valido ");
    sc.close(); //Cerramos el objeto escaner como una buena practica y eliminar la advertencia del compilador.   

  }

  public static void main(String[] args) {
    ingresarNumero();                       //Lo unico que hace la funcion main es mandar ejecucion al metodo ingresar numero
  }
}
