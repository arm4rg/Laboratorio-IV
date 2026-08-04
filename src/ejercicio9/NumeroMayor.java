package ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroMayor {
  static Scanner sc = new Scanner(System.in);  
  static float[] numeros = new float[3];

  public static float ingresarNumero(){
        //Variables que se usaran para la validacion
    boolean numeroValido = false;                           //Ayuda a crear un ciclo que se repite hasta que se ingresa un numero
    float numero=0;                                         //Es tipo float ya que si ingresa un numero con decimales es valido
     

    //inicio del bucle, ingresa con un valor falso y se ejecuta hasta obtener verdadero
    while (!numeroValido) {
      try {
        numero = sc.nextFloat();  
        numeroValido = true;                              //Si el numero ingresado es valido entonces la variable es true y el ciclo termina
      } catch (InputMismatchException e) {                //Captura el tipo InputMismatchException (una cadena en lugar de numero)
        System.out.println("Ha ocurrido un error, ha ingresado una cadena de texto en lugar de un numero.");
        System.out.print("Nuevo numero:  ");
        sc.nextLine();                                      //Limpia el buffer de lo contrario ocurre un bucle infinito sin poder ingresar nada
      }
    }
    return numero;
  }

  public static void llenarArreglo(){
    System.out.println("Ejercicio 9 Mayor de 3 numeros");
    System.out.println("Ingrese 3 numeros");
    
    for(int i=0; i<numeros.length; i++){
      System.out.print("Ingrese numero " +(i+1) +": ");
      numeros[i] = ingresarNumero();
    }

    calcularMayor();
  }

  public static void calcularMayor(){
    float mayor=numeros[0];
    for (float f : numeros) {
      if (mayor<f) {
        mayor = f;
      }
    }

    System.out.println("El numero mayor es el " +mayor);
  }
  public static void main(String[] args) {
    
    llenarArreglo();
    sc.close(); //Cerramos el objeto escaner como una buena practica y eliminar la advertencia del compilador.   
  }
}
