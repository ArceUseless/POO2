package Clases;

public class Bicicleta extends Vehiculos{
  
  //Constructor
  public Bicicleta(int kR) {
    setKilometrosTotales(kR);
    this.kilometrosRecorridos = kR;
  }
  
  //Métodos
  
  /**
   * Muestra un mensaje y suma a "kilometrosRecorridos" el nuevo valor
   * @param kR  Distancia nueva que recorre la bici
   */
  public void pedalear(int kR) {
    this.kilometrosRecorridos += kR;
    setKilometrosTotales(kR);
    System.out.println("Pedaleas con la bici. Recorres "+kR+" metros.");
    
  }
  /**
   * Muestra un mensaje.
   * 
   */
  public void caballito() {
    System.out.println("Haces el caballito con la bici.");
  }
  
  /**
   * Muestra un mensaje con los kilometros recorridos por la bici.
   */
  public void kilometrajeBici() {
    System.out.println("Has recorrido "+this.kilometrosRecorridos+" metros con la bici.");
  }

  

}