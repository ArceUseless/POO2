package Pruebas;
import Clases.Bicicleta;
import Clases.Coche;

import java.util.Scanner;

public class PruebaVehiculos {
  public static void main(String args[]) {
    
    Scanner scanner = new Scanner(System.in);
    
    Bicicleta miBici = new Bicicleta(0);
    Coche miCoche = new Coche(0);
    
    
    boolean salir = false;
    int opcion;
    int cuentaCoche = 0;
    int cuentaBici = 0;
    
    while(!salir) {
      do {
        System.out.println("\n1. Anda con la bicicleta.\n"
            + "2. Haz el caballito con la bicicleta.\n"
            + "3. Anda con el coche.\n"
            + "4. Quema rueda con el coche.\n"
            + "5. Ver kilometraje de la bici.\n"
            + "6. Ver kilometraje del coche.\n"
            + "7. Ver kilometraje total.\n"
            + "8. Salir.\n"
            + "Elige una opción (1-8)");
         opcion= scanner.nextInt();
      }while(opcion <1 || opcion >8);
      
      switch(opcion) {
        case 1:
          System.out.println("¿Cuántos metros quieres pedalear?");
          miBici.pedalear(scanner.nextInt());
          break;
        case 2:
          miBici.caballito();
          break;
        case 3:
          System.out.println("¿Cuántos metros quieres conducir?");
          miCoche.conducir(scanner.nextInt());
          break;
        case 4:
          miCoche.quemarRueda();
          break;
        case 5:
          miBici.kilometrajeBici();
          break;
        case 6:
          miCoche.kilometrajeCoche();
          break;
        case 7:
          miBici.verKilometrajeTotal();
          break;
        case 8:
          System.out.println("¡Adiós!");
          salir = true; 
      }
    } 
  }
}
