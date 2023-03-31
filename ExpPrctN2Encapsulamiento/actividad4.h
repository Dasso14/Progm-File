#include <iostream>
#include <string>
#pragma once
using namespace std;

class Factura {
private:
    int numeroFactura;
    string fechaEmision;
    double monto;

public:
    Factura(int numeroFactura, string fechaEmision, double monto) {
        this->numeroFactura = numeroFactura;
        this->fechaEmision = fechaEmision;
        this->monto = monto;
    }
    int getNumeroFactura() {
        return numeroFactura;
    }
    void setNumeroFactura(int numeroFactura) {
        this->numeroFactura = numeroFactura;
    }
    string getFechaEmision() {
        return fechaEmision;
    }
    void setFechaEmision(string fechaEmision) {
        this->fechaEmision = fechaEmision;
    }
    double getMonto() {
        return monto;
    }
    void setMonto(double monto) {
        this->monto = monto;
    }
};

int main() {
    Factura factura1(12345, "2022-03-25", 500.00);
    Factura factura2(67890, "2022-03-26", 750.00);

    int numeroFactura1 = factura1.getNumeroFactura();
    cout << "Número de factura 1: " << numeroFactura1 << endl;

    factura2.setFechaEmision("2022-03-27");

    double montoFactura2 = factura2.getMonto();
    cout << "Monto de factura 2: $" << montoFactura2 << endl;
}
