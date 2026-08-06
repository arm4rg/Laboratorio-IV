package ejercicio16;

public class pruebaProducto {
  public static void main(String[] args) {
    System.out.println("Producto Digital");
    ProductoDigital productoDigital = new ProductoDigital("Office 365", 2024, 800, "1 año", "Microsoft", "Windows 10");
    productoDigital.mostrarInfo();

    System.out.println("Producto Fisico");
    ProductoFisico productoFisico = new ProductoFisico("Laptop HP 3240", 2026, 7000.58f, "Plastico", 5, "Azul");
    productoFisico.mostrarInfo();
  }
}
