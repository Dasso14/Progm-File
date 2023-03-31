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
        void setTitulo(string t) {
            titulo = t;
        }
        void setAutor(string a) {
            autor = a;
        }
        void setGenero(string g) {
            genero = g;
        }
        string getTitulo() {
            return titulo;
        }
        string getAutor() {
            return autor;
        }
        string getGenero() {
            return genero;
        }
};

int main() {
    Libro libro1;
    libro1.setTitulo("Cien años de soledad");
    libro1.setAutor("Gabriel Garcia Marquez");
    libro1.setGenero("Realismo mágico");

    cout << "El título del libro es: " << libro1.getTitulo() << endl;
    cout << "El autor del libro es: " << libro1.getAutor() << endl;
    cout << "El género del libro es: " << libro1.getGenero() << endl;
}