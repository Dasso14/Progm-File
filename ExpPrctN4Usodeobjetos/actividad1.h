#include <iostream>
#include <string>
#include <vector>
#pragma once
using namespace std;

class Biblioteca {
private:
  string nombre;
  vector<Libro> libros_prestados;
public:
  Biblioteca(string nombre) {
    this->nombre = nombre;
  }

  void prestarLibro(Libro& libro) {
    libro.setPrestamo(true);
    libros_prestados.push_back(libro);
  }
};

class Libro {
private:
  string titulo;
  string autor;
  string genero;
  bool prestamo;
public:
  Libro(string titulo, string autor, string genero) {
    this->titulo = titulo;
    this->autor = autor;
    this->genero = genero;
    this->prestamo = false;
  }
  void devolverLibro() {
    this->prestamo = false;
  }
  void setPrestamo(bool prestamo) {
    this->prestamo = prestamo;
  }
  bool getPrestamo() const {
    return this->prestamo;
  }
  string getTitulo() const {
    return this->titulo;
  }
  string getAutor() const {
    return this->autor;
  }
  string getGenero() const {
    return this->genero;
  }
};

int main() {
  Biblioteca biblioteca("Mi Biblioteca");
  Libro libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico");

  biblioteca.prestarLibro(libro);

  if (libro.getPrestamo()) {
    cout << "El libro " << libro.getTitulo() << " de " << libro.getAutor() << " fue prestado" << endl;
  }

  libro.devolverLibro();

  if (!libro.getPrestamo()) {
    cout << "El libro " << libro.getTitulo() << " de " << libro.getAutor() << " fue devuelto" << endl;
  }

  return 0;
}
 /*
 class Libro {
  private:
    string titulo;
  public:
    void setTitulo(string t) {
      titulo = t;
    }
    string getTitulo() {
      return titulo;
    }
};

 */