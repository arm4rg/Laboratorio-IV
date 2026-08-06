package ejercicio16;

public class ProductoFisico extends Producto {
  //Atributos
  protected String material;
  protected float peso;
  protected String color;

  //Constructor
  public ProductoFisico(String nombre, int anioLanzamiento, float precio, String material, float peso, String color) {
    super(nombre, anioLanzamiento, precio);
    this.material = material;
    this.peso = peso;
    this.color = color;
  }

  @Override
  public void mostrarInfo(){
    System.out.println("    ***Producto Fisico***");
    System.out.println("Nombre: " +nombre);
    System.out.println("Anio lanzamiento: " +anioLanzamiento);
    System.out.println("Material: " +material);
    System.out.println("Peso: " +peso +" libras");
    System.out.println("Color: "+color);
    System.out.println("Precio: Q." +precio);
  }
}
