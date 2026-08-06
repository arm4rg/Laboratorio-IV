package ejercicio2;

public class Vehiculo {
  //Atributos
    protected String marca;
    protected String modelo;
    protected int anio;
    protected int kilometraje;
    protected float precio;

  //Constructor
  public Vehiculo(String marca, String modelo, int anio, int kilometraje, float precio) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.kilometraje = kilometraje;
    this.precio = precio;
  }

  //Mostrar Datos
  public void mostrarDatos(){
   System.out.println("Marca:" +marca );
   System.out.println("Modelo: " +modelo);
   System.out.println("Anio: "+anio);
   System.out.println("Kilometraje: "+kilometraje);
   System.out.println("Precio Q." +precio);
  }

  
}
