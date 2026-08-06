package ejercicio15;

public class pruebaEmpleados {
  public static void main(String[] args) {
    EmpleadoPorHoras empleadoPH = new EmpleadoPorHoras();
    EmpleadoTiempoCompleto empleadoTC = new EmpleadoTiempoCompleto();
    System.out.println("***Empleado Por Hora***");
    empleadoPH.ingresarPH();
    System.out.println();
    System.out.println("***Empleado Tiempo Completo***");
    empleadoTC.ingresarSalario();
  }
}
