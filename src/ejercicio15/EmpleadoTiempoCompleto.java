package ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpleadoTiempoCompleto extends Empleado {
  static Scanner scanner = new Scanner(System.in);
  //Atributos
  protected float salario;
  protected float bonificacion;

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public void setBonificacion(float bonificacion) {
    this.bonificacion = bonificacion;
  }

  public float getSalario() {
    return salario;
  }

  public float getBonificacion() {
    return bonificacion;
  }

  //Ingreso de salario
  public void ingresarSalario(){
    float salary=0f;
    boolean numeroValido = false;                           //Ayuda a crear un ciclo que se repite hasta que se ingresa un numero

    //inicio del bucle, ingresa con un valor falso y se ejecuta hasta obtener verdadero
    while (!numeroValido) {
      try {
        System.out.print("Ingrese el salario Q.");
        salary = scanner.nextFloat();  
        numeroValido = true;   
        setSalario(salary);
        ingresarBonificacion();
      } catch (InputMismatchException e) {                //Captura el tipo InputMismatchException (una cadena en lugar de numero)
      System.out.println("Ha ocurrido un error, ha ingresado una cadena de texto en lugar de un numero.");
      System.out.println("Ingrese otro numero nuevamente.");
      scanner.nextLine();                                      //Limpia el buffer de lo contrario ocurre un bucle infinito sin poder ingresar nada
      }
    }
  }

   public void ingresarBonificacion(){
    float bonito=0f;
    boolean numeroValido = false;                           //Ayuda a crear un ciclo que se repite hasta que se ingresa un numero

    //inicio del bucle, ingresa con un valor falso y se ejecuta hasta obtener verdadero
    while (!numeroValido) {
      try {
        System.out.print("Ingrese la bonificacion del empleado Q ");
        bonito = scanner.nextFloat();  
        numeroValido = true;   
        setBonificacion(bonito);
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
    float salarioTotal = salario + bonificacion;
    System.out.println("El pago total del empleado a tiempo completo es de Q." +salarioTotal);
  }

}
