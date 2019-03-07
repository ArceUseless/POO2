# -*- coding: utf-8 -*-
'''
Created on 7 mar. 2019

@author: d18nicar
'''

class Terminal:
    def __init__(self, num):
        self.numeroTerminal = num
        self.segundosLlamada = 0
    #Métodos
    
    def llama(self, t, seg):
        self.segundosLlamada += seg
        t.segundosLlamada += seg
  
    def __str__(self):
        return 'Nº {} - {}s de conversación'.format(self.numeroTerminal, self.segundosLlamada) 

class Movil:
    def __init__(self, num, tarifa):
        self.numeroTerminal = num
        self.tarifa = tarifa
        self.segundosLlamada = 0
        self.coste = 0
    #Métodos
    
    def llamaMovil(self, t, seg):
        self.segundosLlamada = seg
        if(self.tarifa == 'rata'):
            self.coste += seg*0.001
        elif(self.tarifa == 'mono'):
            self.coste += seg*0.002
        elif(self.tarifa == 'bisonte'):
            self.coste += seg*0.005
        
        t.segundosLlamada += seg
        
    def __str__(self):
        return 'Nº {} - {}s de conversación. - tarificados {} euros'.format(self.numeroTerminal, self.segundosLlamada, self.coste) 
    
if __name__ == "__main__":
    print("Prueba terminal")
    t1 = Terminal("678 11 22 33")
    t2 = Terminal("644 74 44 69")
    t3 = Terminal("622 32 89 09")
    t4 = Terminal("664 73 98 18")
    print(t1)
    print(t2)
    print("\n")
    t1.llama(t2, 320)
    t1.llama(t3, 200)
    print(t1)
    print(t2)
    print(t3)
    print(t4)
    print("\n")
    
    print("Prueba terminal")
    m1 = Movil("678 11 22 33", 'rata')
    m2 = Movil("644 74 44 69", 'mono')
    m3 = Movil("622 32 89 09", 'bisonte')
    print(m1)
    print(m2)
    print("\n")
    m1.llamaMovil(m2, 320)
    m1.llamaMovil(m3, 200)
    m2.llamaMovil(m3, 550)
    print(m1)
    print(m2)
    print(m3)