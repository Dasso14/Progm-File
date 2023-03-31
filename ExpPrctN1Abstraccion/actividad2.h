#include <iostream>
#include <string>
#pragma once
using namespace std;

class Coches{
public:
    std::string modelo;
    int anio;
    int velocidad;

    void acelerar(int cantidad){
        velocidad += cantidad;
    }
    void frenar(int cantidad){
        velocidad -= cantidad;
    }
};

int main(){
    // Creamos otro objeto de la clase Coche para un Ford Mustang del año 1965
    Coches ford;
    ford.modelo = "Ford Mustang";
    ford.anio = 1965;
    ford.velocidad = 0;

    // Interactuamos con el Ford Mustang
    std::cout << "Modelo: " << ford.modelo << ", Año: " << ford.anio << std::endl;
    std::cout << "Velocidad inicial: " << ford.velocidad << " km/h" << std::endl;
    ford.acelerar(50);
    std::cout << "Velocidad después de acelerar 50 km/h: " << ford.velocidad << " km/h" << std::endl;
    ford.frenar(30);
    std::cout << "Velocidad después de frenar 30 km/h: " << ford.velocidad << " km/h" << std::endl;

    return 0;
}