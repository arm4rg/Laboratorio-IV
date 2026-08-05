package ejercicio15;

public class pruebaEmpleados {
  public static void main(String[] args) {
    EmpleadoTiempoCompleto empleadoTC = new EmpleadoTiempoCompleto();
    EmpleadoPorHoras empleadoPH = new EmpleadoPorHoras();
    
    empleadoTC.calculoDePago();
    empleadoPH.calculoDePago();
  }
}
