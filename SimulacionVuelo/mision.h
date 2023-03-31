#include <iostream>
#include <string>
#pragma once
using namespace std;

class Mision {
    private:
        std::string destino;
        int duracion;
        int tripulacion;
    
    public:
        Mision(std::string destino_, int duracion_, int tripulacion_) {
            destino = destino_;
            duracion = duracion_;
            tripulacion = tripulacion_;
        }
        
        std::string getDestino() {
            return destino;
        }
        
        int getDuracion() {
            return duracion;
        }
        
        int getTripulacion() {
            return tripulacion;
        }
};