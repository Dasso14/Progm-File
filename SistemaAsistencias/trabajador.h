#include <iostream>
#include <string>
#include <ctime>
#pragma once

using namespace std;

class Trabajador {
private:
    std::string nombre;
    int dni;
    std::string fecha_ingreso;
    int horas_trabajadas;
    int tardanzas;
    int inasistencias;
public:
    Trabajador(std::string nombre, int dni);
    Trabajador(std::string nombre, int dni, std::string fecha_ingreso);

    std::string getNombre();
    int getDNI();
    std::string getFechaIngreso();
    int getHorasTrabajadas();
    int getTardanzas();
    int getInasistencias();

    void registrarEntrada();
    void incrementarInasistencias();
    void registrarInasistencia();
};

Trabajador::Trabajador(std::string nombre, int dni){
    this->nombre = nombre;
    this->dni = dni;
    this->horas_trabajadas = 0;
    this->tardanzas = 0;
    this->inasistencias = 0;

    time_t now = time(0);
    tm *ltm = localtime(&now);
    this->fecha_ingreso = to_string(1900 + ltm->tm_year) + "-" + to_string(1 + ltm->tm_mon) + "-" + to_string(ltm->tm_mday);
}

Trabajador::Trabajador(std::string nombre, int dni, std::string fecha_ingreso) {
    this->nombre = nombre;
    this->dni = dni;
    this->fecha_ingreso = fecha_ingreso;
    horas_trabajadas = 0;
    tardanzas = 0;
    inasistencias = 0;
}

std::string Trabajador::getNombre() {
    return nombre;
}

int Trabajador::getDNI() {
    return dni;
}

std::string Trabajador::getFechaIngreso() {
    return fecha_ingreso;
}

int Trabajador::getHorasTrabajadas() {
    return horas_trabajadas;
}

int Trabajador::getTardanzas() {
    return tardanzas;
}

int Trabajador::getInasistencias() {
    return inasistencias;
}

void Trabajador::registrarEntrada() {
    time_t now = time(0);
    tm *ltm = localtime(&now);
    int hora = ltm->tm_hour;
    if (hora > 9) {
        tardanzas++;
    }
    horas_trabajadas++;
}

void Trabajador::registrarInasistencia() {
    inasistencias++;
}

void Trabajador::incrementarInasistencias() {
    inasistencias++;
}