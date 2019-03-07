package Pruebas;
import Clases.Hora;

public class PruebaHora {
  public static void main(String args[]) {
    
    Hora hora1 = new Hora(0, 59, 59);
    Hora hora2 = new Hora(0,0,1);
    
    System.out.println("Primera hora: "+hora1+"\nSegunda hora: "+hora2);
    
    System.out.println("Vamos a sumar ambas horas");
    hora1.sumaHoras(hora2);
    System.out.println(hora1);
    
    System.out.println("Ahora vamos a restarlas.");
    hora1.restaHoras(hora2);
    System.out.println(hora1);
    
    System.out.println("Vamos a modificar la segunda hora para que sea 1 hora.");
    hora2.cambiaHora(1, 0, 0);
    System.out.println(hora2);
    
    System.out.println("Por último, vamos a restar a la primera hora la segunda hora que es mayor.");
    hora1.restaHoras(hora2);
    System.out.println(hora1);
  }

}
