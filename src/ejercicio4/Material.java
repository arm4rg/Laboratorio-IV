package ejercicio4;

public class Material{
  //Atributos
  protected int id;
  protected String titulo;
  protected String autor;
  protected int anio;
  protected String editorial;
  protected String disponible;

  //Constructor
  public Material(int id, String titulo, String autor, int anio, String editorial, String disponible) {
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.anio = anio;
    this.editorial = editorial;
    this.disponible = disponible;
  }

  //Mostrar informacion
  void mostrarInformacion(){
    System.out.println("Id: " +id);
    System.out.println("Titulo: " +titulo);
    System.out.println("Autor: " +autor);
    System.out.println("Anio Publicacion: " +anio);
    System.out.println("Editorial: " +editorial);
    System.out.println("Disponible: " +disponible);
  }


  
}
