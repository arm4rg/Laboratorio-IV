package ejercicio4;

public class Libro extends Material {
  //Atributos
  protected int numPaginas;
  protected String genero;

  //Constructor
  public Libro(int id, String titulo, String autor, int anio, String editorial, String disponible, int numPaginas,
      String genero) {
    super(id, titulo, autor, anio, editorial, disponible);
    this.numPaginas = numPaginas;
    this.genero = genero;
  }

  //Metodos
  @Override
  void mostrarInformacion(){
    System.out.println("    ***Libro***" );
    System.out.println("Id: " +id);
    System.out.println("Titulo: " +titulo);
    System.out.println("Autor: " +autor);
    System.out.println("Anio Publicacion: " +anio);
    System.out.println("Editorial: " +editorial);
    System.out.println("Numero de Paginas: " +numPaginas);
    System.out.println("Genero: " +genero);
    System.out.println("Disponible: " +disponible);
  }

  

  
}
