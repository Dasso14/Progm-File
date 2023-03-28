#include <iostream>
#include <string>
#include <ctime>
#include "trabajador.h"
#pragma once

using namespace std; 

class Empresa {
private:
    std::string nombre;
    int ruc;
    Trabajador *trabajadores[100];
    int cant_trabajadores;
public:
    Empresa(std::string nombre, int ruc);

    std::string getNombre();
    int getRUC();

    void contratar(Trabajador *trabajador);
    int getCantTrabajadores();
    Trabajador* getTrabajador(int i);
    Trabajador* buscarTrabajador(int dni);
    void registrarEntradaTrabajador(int dni);
    void registrarInasistencia(int dni);
    void despedir(int dni);
};

Empresa::Empresa(std::string nombre, int ruc) {
    this->nombre = nombre;
    this->ruc = ruc;
    cant_trabajadores = 0;
}

std::string Empresa::getNombre() {
    return nombre;
}

int Empresa::getRUC() {
    return ruc;
}

void Empresa::contratar(Trabajador *trabajador) {
    trabajadores[cant_trabajadores] = trabajador;
    cant_trabajadores++;
}

int Empresa::getCantTrabajadores() {
    return cant_trabajadores;
}

Trabajador* Empresa::getTrabajador(int i) {
    return trabajadores[i];
}

Trabajador* Empresa::buscarTrabajador(int dni) {
    for (int i = 0; i < cant_trabajadores; i++) {
        if (trabajadores[i]->getDNI() == dni) {
            return trabajadores[i];
        }
    }
    return nullptr;
}

void Empresa::registrarEntradaTrabajador(int dni) {
    Trabajador* trabajador = buscarTrabajador(dni);
    if (trabajador != nullptr) {
        trabajador->registrarEntrada();
    }
}

void Empresa::registrarInasistencia(int dni) {
    Trabajador* trabajador = buscarTrabajador(dni);
    if (trabajador != nullptr) {
        trabajador->incrementarInasistencias();
    }
}

void Empresa::despedir(int dni) {
    for (int i = 0; i < cant_trabajadores; i++) {
        if (trabajadores[i]->getDNI() == dni) {
            delete trabajadores[i];
            for (int j = i; j < cant_trabajadores - 1; j++) {
                trabajadores[j] = trabajadores[j + 1];
            }
            cant_trabajadores--;
            return;
        }
    }
}

