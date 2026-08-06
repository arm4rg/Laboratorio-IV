package ejercicio4;

public class Revista extends Material {
  //Atributos
  protected int numEdicion;
  protected String frecuencia;
  protected String tematica;

  //Constructor
  public Revista(int id, String titulo, String autor, int anio, String editorial, String disponible, int numEdicion,
      String frecuencia, String tematica) {
    super(id, titulo, autor, anio, editorial, disponible);
    this.numEdicion = numEdicion;
    this.frecuencia = frecuencia;
    this.tematica = tematica;
  }
  
  //Metodo sobreescrito
  @Override
  void mostrarInformacion(){
    System.out.println("    ***Revista***");
    System.out.println("Id: " +id);
    System.out.println("Titulo: " +titulo);
    System.out.println("Autor: " +autor);
    System.out.println("Anio Publicacion: " +anio);
    System.out.println("Editorial: " +editorial);
    System.out.println("Numero de edicion: " +numEdicion);
    System.out.println("Frecuencia: " +frecuencia);
    System.out.println("Tematica: " +tematica);
    System.out.println("Disponible: " +disponible);
  }

  
}
