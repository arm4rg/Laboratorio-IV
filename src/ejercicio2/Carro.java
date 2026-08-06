package ejercicio2;

public class Carro extends Vehiculo{
  //Atributos
  private String transmision;
  private int numPuertas;
  private int numAsientos;

  //Metodos
  public Carro(String marca, String modelo, int anio, int kilometraje, float precio, String transmision, int numPuertas,
      int numAsientos) {
    super(marca, modelo, anio, kilometraje, precio);
    this.transmision = transmision;
    this.numPuertas = numPuertas;
    this.numAsientos = numAsientos;
  }

  @Override
  public void mostrarDatos(){
    System.out.println("    ***Auto*** ");
    System.out.println("Marca:" +marca );
    System.out.println("Modelo: " +modelo);
    System.out.println("Anio: "+anio);
    System.out.println("Kilometraje: "+kilometraje);
    System.out.println("Transmision: " +transmision);
    System.out.println("Numero de puertas: " +numPuertas);
    System.out.println("Numero de asientos: " +numAsientos);
    System.out.println("Precio Q." +precio);
  }

  
}
