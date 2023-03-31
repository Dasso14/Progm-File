#include <iostream>
#include <string>
#pragma once
using namespace std;

class CuentaBancaria {
private:
    string numCuenta;
    double saldo;
public:
    void setNumCuenta(string num) { numCuenta = num; }
    string getNumCuenta() { return numCuenta; }
    void setSaldo(double s) { saldo = s; }
    double getSaldo() { return saldo; }
};

int main() {
    CuentaBancaria cuenta1;
    cuenta1.setNumCuenta("123456789");
    cuenta1.setSaldo(1000.0);
    cout << "Numero de cuenta: " << cuenta1.getNumCuenta() << endl;
    cout << "Saldo: " << cuenta1.getSaldo() << endl;
    return 0;
}
