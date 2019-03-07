package Clases;

public class Coche extends Vehiculos {
  //Constructor
    public Coche(int kR) {
      setKilometrosTotales(kR);
      this.kilometrosRecorridos = kR;
    }
    
    //Métodos
    
    /**
     * Muestra un mensaje y suma a "kilometrosRecorridos" el nuevo valor
     * @param kR  Distancia nueva que recorre el coche
     */
    public void conducir(int kR) {
      this.kilometrosRecorridos += kR;
      setKilometrosTotales(kR);
      System.out.println("Conduces un rato.Recorres "+kR+" metros.");
    }
    /**
     * Muestra un mensaje.
     * 
     */
    public void quemarRueda() {
      System.out.println("Quemas rueda.");
    }
    
    /**
     * Muestra un mensaje con los kilometros recorridos por el coche.
     */
    public void kilometrajeCoche() {
      System.out.println("Has recorrido "+this.kilometrosRecorridos+" metros con el coche.");
    }
}
