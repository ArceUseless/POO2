package Clases;

public class Terminal {
  
  //Atributos
  int segundosLlamada;
  String numeroTerminal;
  
  //Constructores
  
  public Terminal() {
    this.segundosLlamada = 0;
  }
  
  public Terminal(String num) {
    this.numeroTerminal = num;
    this.segundosLlamada = 0;
  }
  
  //Metodos
  
  public void llama(Terminal t, int segundos) {
    this.segundosLlamada += segundos;
    t.segundosLlamada += segundos;
  }
  
  public String toString() {
    return "Nº "+this.numeroTerminal+" - "+this.segundosLlamada+"s de conversación.";
  }

}
