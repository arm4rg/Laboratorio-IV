package ejercicio1;

public class pruebaAnimal {
  public static void main(String[] args) {
    //Creacion de objetos
    Perro perro = new Perro();
    Gato gato = new Gato();

    //Ejercicio 1
    System.out.println("Ejercicio 1 Clase Abstracta Animal");
    System.out.println("  ->Clase Perro:");
    //Usando los metodos polimorficos
    perro.hacerSonido();
    System.out.println("  ->Clase Gato:");
    gato.hacerSonido();
  }
}
