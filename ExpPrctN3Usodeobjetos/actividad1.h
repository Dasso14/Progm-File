#include <iostream>
#include <string>
#pragma once
using namespace std;

class Persona {
private:
    string nombre;
    int edad;
    char genero;
public:
    void setNombre(string n) { nombre = n; }
    string getNombre() { return nombre; }
    void setEdad(int e) { edad = e; }
    int getEdad() { return edad; }
    void setGenero(char g) { genero = g; }
    char getGenero() { return genero; }
};

int main() {
    Persona persona1;
    persona1.setNombre("Juan");
    persona1.setEdad(25);
    persona1.setGenero('M');
    cout << "Nombre: " << persona1.getNombre() << endl;
    cout << "Edad: " << persona1.getEdad() << endl;
    cout << "Genero: " << persona1.getGenero() << endl;
    return 0;
}
