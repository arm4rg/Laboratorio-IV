package ejercicio2;

public class pruebaVehiculo {
  public static void main(String[] args) {
    //Creando los objetos
    Carro carro = new Carro("Hyundai", "Kona", 2027, 1000, 50000f, "automatica", 4, 5);
    Moto moto = new Moto("Honda","Navi",2027, 400, 11450f, 500, "deportivo");

    //Ejercicio 2
    System.out.println("Ejercicio 2 Clase Vehiculo");
    //Usando los metodos sobreescritos
    System.out.println("Clase Hija Carro");
    carro.mostrarDatos();
    System.out.println("Clase Hija Moto");
    moto.mostrarDatos();
  }
}
