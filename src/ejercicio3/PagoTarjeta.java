package ejercicio3;

public class PagoTarjeta extends Pago{
  //Atributos

  //Metodos
  @Override
  void procesarPago(){
    System.out.println("    ***Pagos con Tarjeta***");
    System.out.println("El pago con tarjeta se ha procesado exitosamente :)");
  }

}
