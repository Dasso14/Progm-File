#include <iostream>
#include <string>
#pragma once
using namespace std;

class Libro {
private:
    string titulo;
    string autor;
    string genero;
public:
    void setTitulo(string t) { titulo = t; }
    string getTitulo() { return titulo; }
    void setAutor(string a) { autor = a; }
    string getAutor() { return autor; }
    void setGenero(string g) { genero = g; }
    string getGenero() { return genero; }
};

int main() {
    Libro libro1;
    libro1.setTitulo("El Quijote");
    libro1.setAutor("Miguel de Cervantes");
    libro1.setGenero("Novela");
    cout << "Titulo: " << libro1.getTitulo() << endl;
    cout << "Autor: " << libro1.getAutor() << endl;
    cout << "Genero: " << libro1.getGenero() << endl;
    return 0;
}
