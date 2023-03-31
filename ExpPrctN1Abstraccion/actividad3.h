#include <iostream>
#include <string>
#include <random>
#pragma once
using namespace std;

class Estudiantes{
public:
    std::string nombre;
    int edad;
    std::string grado;
    float calificacion;

    void tomarExamen(){
        calificacion = rand()%21;
    }
    void calificar(float calificacion){
        this->calificacion = calificacion;
    }
};

int main(){
    // Creamos un objeto de la clase Estudiante para un estudiante llamado Juan
    Estudiantes juan;
    juan.nombre = "Juan";
    juan.edad = 18;
    juan.grado = "12vo grado";
    juan.calificacion = 0;

    // Interactuamos con Juan
    std::cout << "Nombre: " << juan.nombre << ", Edad: " << juan.edad << ", Grado: " << juan.grado << std::endl;
    juan.tomarExamen();
    std::cout << "Calificación después de tomar examen: " << juan.calificacion << std::endl;
    juan.calificar(14);
    std::cout << "Calificación después de ser calificada: " << juan.calificacion << std::endl;
}