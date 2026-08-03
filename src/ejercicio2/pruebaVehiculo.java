package ejercicio2;

public class pruebaVehiculo {
  public static void main(String[] args) {
    //Creando los objetos
    Carro carro = new Carro();
    Moto moto = new Moto();

    //Ejercicio 2
    System.out.println("Ejercicio 2 Clase Vehiculo");
    //Usando los metodos sobreescritos
    System.out.println("Clase Hija Carro");
    carro.mostrarDatos();
    System.out.println("Clase Hija Moto");
    moto.mostrarDatos();
  }
}
