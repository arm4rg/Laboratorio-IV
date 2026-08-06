package ejercicio2;

public class Moto extends Vehiculo {
  //Atributos
  protected int cilindrada;
  protected String tipoManubrio;

  //Constructor
  public Moto(String marca, String modelo, int anio, int kilometraje, float precio, int cilindrada,
      String tipoManubrio) {
    super(marca, modelo, anio, kilometraje, precio);
    this.cilindrada = cilindrada;
    this.tipoManubrio = tipoManubrio; 
  }

  @Override
  public void mostrarDatos(){
    System.out.println("    ***Moto***");
    System.out.println("Marca:" +marca );
    System.out.println("Modelo: " +modelo);
    System.out.println("Anio: "+anio);
    System.out.println("Kilometraje: "+kilometraje);
    System.out.println("Cilindraje: " +cilindrada +" cc");
    System.out.println("Tipo de manubrio: " +tipoManubrio);
    System.out.println("Precio Q." +precio);
  }
  

}
