package ejercicio3;

public class PagoEfectivo extends Pago {
  //Atributos

  //Metodos
  @Override
  void procesarPago(){
    System.out.println("    ***Pagos en Efectivo***");
    System.out.println("El pago en efectivo se ha procesado exitosamente :)");
  }

}
