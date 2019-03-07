# -*- coding: utf-8 -*-
'''
Created on 6 mar. 2019

@author: Rafael Nieto
'''
class Vehiculos:
    #Atributos
    
    vehiculosCreados = 0
    kilometrosTotales = 0
    
    #Constructor
    def __init__(self):
        Vehiculos.vehiculosCreados += 1
    
    #M�todos
    def setKilometrosTotales(self,kilometrosRecorridos):
        Vehiculos.kilometrosTotales += kilometrosRecorridos
    
    def verKilometrajeTotal(self):
        print("El kilometraje total es de ", Vehiculos.kilometrosTotales," metros.")

class Bicicleta(Vehiculos):
    #Constructor
    def __init__(self, kilometrosRecorridos):
        Vehiculos.setKilometrosTotales(kilometrosRecorridos)
        self.kilometrosRecorridos = kilometrosRecorridos
    
    #Métodos
    '''
    Muestra un mensaje y suma a "kilometrosRecorridos" el nuevo valor 
    
    Parámetros
        kilometrosRecorridos:  Distancia nueva que recorre la bici
    '''    
    def pedalear(self, kilometrosRecorridos):
        self.kilometrosRecorridos += kilometrosRecorridos
        Vehiculos.setKilometrosTotales(kilometrosRecorridos)
        print("Pedaleas con la bici. Recorres",kilometrosRecorridos," metros.")
    
    '''
    Muestra un mensaje
    
    '''
    def caballito(self):
        print("Haces el caballito con la bici.")
        
    '''
    Muestra un mensaje con los kilómetros recorridos por la bici
    
    '''
    
    def kilometrajeBici(self):
        print("Has recorrido",self.kilometrosRecorridos," metros con la bici.")
               
class Coche(Vehiculos):
    #Constructor
    def __init__(self, kilometrosRecorridos):
        Vehiculos.setKilometrosTotales(kilometrosRecorridos)
        self.kilometrosRecorridos = kilometrosRecorridos
    
    #Métodos
    '''
    Muestra un mensaje y suma a "kilometrosRecorridos" el nuevo valor
    
    Parámetros
        kilometrosRecorridos: Distancia nueva que recorre el coche
    
    '''
    def conducir(self, kilometrosRecorridos):
        self.kilometrosRecorridos += kilometrosRecorridos
        Vehiculos.setKilometrosTotales(kilometrosRecorridos)
        print("Conduces un rato. Recorres",kilometrosRecorridos," metros.")
        
    '''
    Muestra un mensaje
    
    '''
    def quemarRueda(self):
        print("Quemas rueda.")
    
    '''
    Muestra un mensaje con los kilometros recorridos del coche
    
    '''
    
    def kilometrajeCoche(self):
        print("Has recorrido",self.kilometrosRecorridos," metros con el coche.")
    
    
if __name__ == "__main__":
    a = 0
    miBici = Bicicleta(0)
    miCoche = Coche(0)
    
    while(a == 0):
        opcion = -1
        while(opcion <1 or opcion >8):
            print("\n1. Anda con la bicicleta\n2. Haz el caballito con la bici\n3. Anda con el coche\n4. Quema rueda con el coche\n5. Ver kilometraje de la bici\n6. Ver kilometraje del coche\n7. Ver kilometraje total\n8. Salir")
            opcion = input("Elige una opción (1-8)")
         
        if(opcion == 1):
            miBici.pedalear(input("¿Cuántos metros quieres pedalear?"))
        elif(opcion == 2):
            miBici.caballito()
        elif(opcion == 3):
            miCoche.conducir(input("¿Cuántos metros quieres conducir?"))
        elif(opcion == 4):
            miCoche.quemarRueda()
        elif(opcion == 5):
            miBici.kilometrajeBici()
        elif(opcion == 6):
            miCoche.kilometrajeCoche()
        elif(opcion == 7):
            miBici.verKilometrajeTotal()
        elif(opcion == 8):
            print("¡Adiós!")
            salir = 1
        