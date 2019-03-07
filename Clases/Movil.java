package Clases;

public class Movil extends Terminal {
  
  //Atributos
  String tarifa;
  double coste;
  
  //Constructor
  public Movil(String num, String tarifa) {
    this.numeroTerminal = num;
    this.tarifa = tarifa;
    this.segundosLlamada = 0;
  }
  
  //Metodos
  
  @Override
  public void llama(Terminal t, int s) {
    this.segundosLlamada =s;
    switch(tarifa) {
    case "rata":
      this.coste +=s*0.001;
      break;
    case "mono":
      this.coste +=s*0.002;
      break;
    case "bisonte":
      this.coste +=s*0.005;
      break;
  }
    t.segundosLlamada += s;
  }
  
  @Override
  public String toString() {
    return "Nº "+this.numeroTerminal+" - "+this.segundosLlamada+"s de conversación. - tarificados "+String.format("%.2f", this.coste)+" euros";
  }

}
