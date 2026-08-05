package ejercicio15;

public class EmpleadoTiempoCompleto extends Empleado {
  @Override
  public void calculoDePago(){
    System.out.println("El pago de un empleado a tiempo commpleto es del 100% del salario minimo.");
  }
}
