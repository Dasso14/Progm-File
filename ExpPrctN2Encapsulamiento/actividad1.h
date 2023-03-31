#include <iostream>
#include <string>
#pragma once
using namespace std;

class Persona {
private:
    std::string nombre;
    int edad;
    char genero;

public:
    Persona(std::string n, int e, char g) {
        nombre = n;
        edad = e;
        genero = g;
    }

    std::string getNombre() const {
        return nombre;
    }

    void setNombre(const std::string& n) {
        nombre = n;
    }

    int getEdad() const {
        return edad;
    }

    void setEdad(int e) {
        edad = e;
    }

    char getGenero() const {
        return genero;
    }

    void setGenero(char g) {
        genero = g;
    }
};

int main() {
    Persona p1("Ana", 25, 'F');
    std::cout << "Nombre: " << p1.getNombre() << std::endl;
    std::cout << "Edad: " << p1.getEdad() << std::endl;
    std::cout << "Género: " << p1.getGenero() << std::endl;
    
    p1.setEdad(30);
    std::cout << "Nueva edad: " << p1.getEdad() << std::endl;
    
    return 0;
}