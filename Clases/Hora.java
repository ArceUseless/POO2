package Clases;

public class Hora {
  
  //Atributos
  int horas;
  int minutos;
  int segundos;
  
  boolean ms = false;
  
  //Constructor
  
  public Hora (int h, int m, int s) {
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }
  
  
  //Setters
  private void setSegundos(int s) {
    while(s > 59) {
      s -= 60;
      this.minutos++;
    }
    if(s < 0) {
      s = 0;
    }
    this.segundos = s;
  }
  
  private void setMinutos(int m) {
    while(m > 59) {
      m -= 60;
      this.horas++;
    }
    this.minutos = m;
  }
  
  private void setHoras(int h) {
    this.horas = h;
  }
  
  //Metodos
  
  public void sumaHoras(Hora hora) {
    setSegundos(this.segundos + hora.segundos);
    setMinutos(this.minutos + hora.minutos);
    setHoras(this.horas + hora.horas);
    return;
  }
  
  public void restaHoras (Hora hora) {
    int segundosTotales = segundosTotales(this.horas, this.minutos, this.segundos)-segundosTotales(hora.horas, hora.minutos, hora.segundos);
    this.segundos = 0;
    this.minutos = 0;
    this.horas = 0;
    setSegundos(segundosTotales);
  }
  
  private int segundosTotales (int h, int m, int s) {
    return s + m*60 + h*3600;
  }
  
  public void cambiaHora (int h, int m, int s) {
    setSegundos(s);
    setMinutos(m);
    setHoras(h);
  }
  
  public String toString() {
      return this.horas+"h "+this.minutos+"m "+this.segundos+"s";
    }   
  }

