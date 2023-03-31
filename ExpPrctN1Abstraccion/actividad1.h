#include <iostream>
#include <string>
#pragma once
using namespace std;

class Animales{
public:
    std::string nombre;
    int edad;
    std::string tipoAnimal;

    void hacerSonido(){
        std::cout<<"El "<<tipoAnimal<<nombre<<" hace un ruido";
    }
    void comer(int cantidad){
        std::cout<<"El "<<tipoAnimal<<nombre<<" come "<<cantidad<<" unidades de comida.\n";
    }
};

int main(){
    Animales gato;
    gato.nombre = "Pepe";
    gato.edad = 4;
    gato.tipoAnimal = "Gato";

    gato.hacerSonido();
    gato.comer(4);
}