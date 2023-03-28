#include <iostream>
#include <string>
#include <ctime>
#include "trabajador.h"
#include "empresa.h"
#pragma once

const int MAX_TARDANZA = 30;

class Reporte {
private:
    Trabajador *trabajador;
    int horas_trabajadas;
    int tardanzas;
    int inasistencias;
public:
    Reporte(Trabajador *trabajador);
    void registrarEntrada(tm *ltm);
    void registrarInasistencia();
    void mostrarReporte();
};

Reporte::Reporte(Trabajador *trabajador) {
    this->trabajador = trabajador;
    horas_trabajadas = 0;
    tardanzas = 0;
    inasistencias = 0;
}

void Reporte::registrarEntrada(tm *ltm) {
    int hora = ltm->tm_hour;
    if (hora > 8 && hora < 8 + MAX_TARDANZA) {
        tardanzas++;
    }
    horas_trabajadas++;
}

void Reporte::registrarInasistencia() {
    inasistencias++;
}

void mostrarReporte(Empresa& empresa) {
    for (int i = 0; i < empresa.getCantTrabajadores(); i++) {
        Reporte reporte(empresa.getTrabajador(i));
        reporte.mostrarReporte();
    }
}

void Reporte::mostrarReporte() {
    std::cout << "Reporte del trabajador " << trabajador->getNombre() << std::endl;
    std::cout << "Horas trabajadas: " << horas_trabajadas << std::endl;
    std::cout << "Tardanzas: " << tardanzas << std::endl;
    std::cout << "Inasistencias: " << inasistencias << std::endl;
    std::cout << std::endl;
}

void registrarEntradaEmpresa(Empresa& empresa) {
    int dni;
    std::cout << "Ingrese el DNI del trabajador: ";
    std::cin >> dni;
    Trabajador *trabajador = empresa.buscarTrabajador(dni);
    if (trabajador == nullptr) {
        std::cout << "No se encontro un trabajador con ese DNI." << std::endl;
    } else {
        time_t now = time(0);
        tm *ltm = localtime(&now);
        Reporte reporte(trabajador);
        reporte.registrarEntrada(ltm);
        std::cout << "Entrada registrada para el trabajador " << trabajador->getNombre() << std::endl;
    }
}

void registrarInasistencia(Empresa &empresa) {
    int dni;
    std::cout << "Ingrese el DNI del trabajador que faltó: ";
    std::cin >> dni;
    Trabajador *trabajador = empresa.buscarTrabajador(dni);
    if (trabajador != nullptr) {
        trabajador->incrementarInasistencias();
        std::cout << "Inasistencia registrada correctamente para " << trabajador->getNombre() << std::endl;
    } else {
        std::cout << "No se encontro a ningun trabajador con DNI " << dni << std::endl;
    }
}
