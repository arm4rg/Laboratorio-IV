package ejercicio4;

public class pruebaMaterial {
  public static void main(String[] args) {
    //Creando objetos
    Libro libro = new Libro(52, "Carazamba", "Virgilio R", 1980, "Piedra Santa", "Si", 150, "Drama");
    Revista revista = new Revista(25, "GQ", "Paolo M.", 2015, "Force", "No", 140, "Trimestral", "Moda");
    
    //Mostrando informacion de objetos
    libro.mostrarInformacion();
    revista.mostrarInformacion();
    
  }
}
