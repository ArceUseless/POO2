package Clases;

public class Vehiculos {
  
  //Atributos de clase
  private static int vehiculosCreados;
  private static int kilometrosTotales;
  
  //Atributos de instancia
  int kilometrosRecorridos;

  //Constructor
  public Vehiculos () {
    vehiculosCreados++;
  }
  
  //Setters
  
  protected void setKilometrosTotales(int kR) {
    kilometrosTotales += kR;
  }
  //Metodos
  
  /**
   * Muestra una mensaje con el kilometraje total
   */
  public void verKilometrajeTotal() {
    System.out.println("El kilometraje total es de "+kilometrosTotales+" metros.");
  }
    
}
