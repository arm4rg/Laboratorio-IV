package ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpleadoPorHoras extends Empleado{
  static Scanner scanner = new Scanner(System.in);

  //Atributos
  protected float pagoPorHora;
  protected int horasTrabajadas;


  public float getPagoPorHora() {
    return pagoPorHora;
  }

  public int getHorasTrabajadas() {
    return horasTrabajadas;
  }

  public void setPagoPorHora(float pagoPorHora) {
    this.pagoPorHora = pagoPorHora;
  }

  public void setHorasTrabajadas(int horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
  }

  //Ingreso de datos
  public void ingresarPH(){
    float pXH=0;
    boolean numeroValido = false;                           //Ayuda a crear un ciclo que se repite hasta que se ingresa un numero

    //inicio del bucle, ingresa con un valor falso y se ejecuta hasta obtener verdadero
    while (!numeroValido) {
      try {
        System.out.print("Ingrese el pago por hora trabajada Q.");
        pXH = scanner.nextFloat();  
        numeroValido = true;   
        setPagoPorHora(pXH);
        ingresarCH();
      } catch (InputMismatchException e) {                //Captura el tipo InputMismatchException (una cadena en lugar de numero)
      System.out.println("Ha ocurrido un error, ha ingresado una cadena de texto en lugar de un numero.");
      System.out.println("Ingrese otro numero nuevamente.");
      scanner.nextLine();                                      //Limpia el buffer de lo contrario ocurre un bucle infinito sin poder ingresar nada
      }
    }
  }

  public void ingresarCH(){
    int cH=0;
    boolean numeroValido = false;                           //Ayuda a crear un ciclo que se repite hasta que se ingresa un numero

    //inicio del bucle, ingresa con un valor falso y se ejecuta hasta obtener verdadero
    while (!numeroValido) {
      try {
        System.out.print("Ingrese la cantidad de horas trabajadas Q.");
        cH = scanner.nextInt();  
        numeroValido = true;   
        setHorasTrabajadas(cH);
        calculoDePago();
      } catch (InputMismatchException e) {                //Captura el tipo InputMismatchException (una cadena en lugar de numero)
      System.out.println("Ha ocurrido un error, ha ingresado una cadena de texto en lugar de un numero.");
      System.out.println("Ingrese otro numero nuevamente.");
      scanner.nextLine();                                      //Limpia el buffer de lo contrario ocurre un bucle infinito sin poder ingresar nada
      }
    }

  }

  @Override
  public void calculoDePago(){
    float pagoTotal = pagoPorHora * horasTrabajadas;
    System.out.println("El pago total del trabajador por horas es de Q." +pagoTotal);
    scanner.close();
  }
}
