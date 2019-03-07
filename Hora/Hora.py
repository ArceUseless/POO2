# -*- coding: utf-8 -*-

'''
Created on 6 mar. 2019

@author: Rafael Nieto
'''


class Hora:
    #Constructor
    def __init__ (self, h, m, s):
        self.horas = h
        self.minutos = m
        self.segundos = s
        
    #Setters
    
    def setSegundos(self, s):
        while(s > 59):
            s -= 60;
            self.minutos += 1
        if(s < 0):
            s = 0
        self.segundos = s
    
    def setMinutos(self, m):
        while(m > 59):
            m -= 60;
            self.horas += 1
    
        self.minutos = m;
    
    def setHoras(self, h):
        self.horas = h
    
    
    #Métodos
    
    def sumaHoras(self, hora):
        self.setSegundos(self.segundos + hora.segundos)
        self.setMinutos(self.minutos + hora.minutos)
        self.setHoras(self.horas + hora.horas)
    
    def restaHoras(self, hora):
        self.setSegundos((self.segundosTotales(self.horas, self.minutos, self.segundos)- self.segundosTotales(hora.horas, hora.minutos, hora.segundos)))
        self.segundos = 0
        self.minutos = 0
        self.horas = 0
          
    def segundosTotales (self, h, m, s):
        return s + m*60 + h*3600
  
    def cambiaHora (self, h, m, s):
        self.setSegundos(s)
        self.setMinutos(m)
        self.setHoras(h)
    
    def __str__(self):
        return '{}h {}m {}s'.format(self.horas, self.minutos, self.segundos)

if __name__ == "__main__":
    hora1 = Hora(0, 59, 59);
    hora2 = Hora(0,0,1);
    
    print("Primera hora: ",hora1,"\nSegunda hora: ",hora2);
    
    print("Vamos a sumar ambas horas");
    hora1.sumaHoras(hora2);
    print(hora1);
    
    print("Ahora vamos a restarlas.");
    hora1.restaHoras(hora2);
    print(hora1);
    
    print("Vamos a modificar la segunda hora para que sea 1 hora.");
    hora2.cambiaHora(1, 0, 0);
    print(hora2);
    
    print("Por último, vamos a restar a la primera hora la segunda hora que es mayor.");
    hora1.restaHoras(hora2);
    print(hora1);
