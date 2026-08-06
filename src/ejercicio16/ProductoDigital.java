package ejercicio16;

public class ProductoDigital extends Producto{
  //Atributos
  protected String licencia;
  protected String desarrolladora;
  protected String sistemaOp;

  //Constructor
  public ProductoDigital(String nombre, int anioLanzamiento, float precio, String licencia, String desarrolladora,
      String sistemaOp) {
    super(nombre, anioLanzamiento, precio);
    this.licencia = licencia;
    this.desarrolladora = desarrolladora;
    this.sistemaOp = sistemaOp;
  }

  @Override
  public void mostrarInfo(){
    System.out.println("    ***Producto Digital***");
    System.out.println("Nombre: " +nombre);
    System.out.println("Anio lanzamiento: " +anioLanzamiento);
    System.out.println("Licencia: " +licencia);
    System.out.println("Desarrolladora: " +desarrolladora);
    System.out.println("Sistema Operativo: " +sistemaOp);
    System.out.println("Precio: Q." +precio);
  }
}
