#include <iostream>
#include <string>
#pragma once
using namespace std;

class Factura {
  private:
    int numFactura;
    string fechaEmision;
    double monto;
  public:
    void setNumFactura(int num) {
      numFactura = num;
    }
    void setFechaEmision(string fecha) {
      fechaEmision = fecha;
    }
    void setMonto(double monto) {
      this->monto = monto;
    }
    int getNumFactura() {
      return numFactura;
    }
    string getFechaEmision() {
      return fechaEmision;
    }
    double getMonto() {
      return monto;
    }
};

int main() {
  Factura factura1, factura2;

  factura1.setNumFactura(1234);
  factura1.setFechaEmision("2022-03-25");
  factura1.setMonto(500.75);

  cout << "Número de factura: " << factura1.getNumFactura() << endl;
  cout << "Fecha de emisión: " << factura1.getFechaEmision() << endl;
  cout << "Monto: $" << factura1.getMonto() << endl;

  factura2.setNumFactura(5678);
  factura2.setFechaEmision("2022-03-26");
  factura2.setMonto(800.50);

  cout << "Número de factura: " << factura2.getNumFactura() << endl;
  cout << "Fecha de emisión: " << factura2.getFechaEmision() << endl;
  cout << "Monto: $" << factura2.getMonto() << endl;
}
