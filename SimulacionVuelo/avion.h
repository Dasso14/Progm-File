#include <iostream>
#include <string>
#include "mision.h"
#pragma once
using namespace std;

class Avion {
    private:
        std::string modelo;
        int capacidad_combustible;
        int consumo_combustible;
    
    public:
        Avion(std::string modelo_, int capacidad_combustible_, int consumo_combustible_) {
            modelo = modelo_;
            capacidad_combustible = capacidad_combustible_;
            consumo_combustible = consumo_combustible_;
        }
        
        std::string getModelo() {
            return modelo;
        }
        
        int getCapacidadCombustible() {
            return capacidad_combustible;
        }
        
        int getConsumoCombustible() {
            return consumo_combustible;
        }
        
        bool simularMision(Mision mision) {
            int combustible_necesario = mision.getDuracion() * consumo_combustible;
            
            if (combustible_necesario > capacidad_combustible) {
                std::cout << "El avion no tiene suficiente combustible para completar la mision." << std::endl;
                return false;
            }
            
            if (mision.getTripulacion() > 100) {
                std::cout << "El avion no puede llevar a cabo la mision con mas de 100s tripulantes." << std::endl;
                return false;
            }
            
            std::cout << "La mision a " << mision.getDestino() << " ha sido completada con exito." << std::endl;
            return true;
        }
};