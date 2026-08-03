package ejercicio3;

public class pruebaPagos {
  public static void main(String[] args) {
    //Creacion de Objetos pago efectivo y pago con tarjeta
    PagoTarjeta pagoTarjeta1 = new PagoTarjeta();
    PagoEfectivo pagoEfectivo1 = new PagoEfectivo();

    //Mensaje de Bienvenida
    System.out.println("  ***Bienvenido al Sistema de Pagos***");

    //El objeto pago con tarjeta usa el metodo procesar pago (polimorfismo)
    pagoTarjeta1.procesarPago();
    
    System.out.println();   //Un salto de linea para que se separe el metodo del objeto 1 y del objeto 2
    
    //El objeto pago en efectivo usa el metodo procesar pago (polimorfismo)
    pagoEfectivo1.procesarPago();

    System.out.println();     //Un salto de linea para separar el metodo usado con el resto del programa de la clase prueba pagos
    System.out.println("Saliendo del sistema, buen dia...");    //Mensaje de finalizacion de ejecucion de codigo
    
  }
}
