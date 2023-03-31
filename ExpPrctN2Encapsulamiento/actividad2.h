#include <iostream>
#include <string>
#pragma once
using namespace std;

class CuentaBancaria {
private:
    int numeroCuenta;
    double saldo;
    int total;

public:
    CuentaBancaria(int numeroCuenta, double saldo) {
        this->numeroCuenta = numeroCuenta;
        this->saldo = saldo;
    }
    void retirar(int monto){
        saldo -= monto;
    }
    void depositar(int monto){
        saldo += monto;
    }

    int getNumeroCuenta() {
        return numeroCuenta;
    }
    double getSaldo() {
        return saldo;
    }

    void setNumeroCuenta(int numeroCuenta) {
        this->numeroCuenta = numeroCuenta;
    }
    void setSaldo(double saldo) {
        this->saldo = saldo;
    }
};

int main() {
    // Creamos una cuenta bancaria con saldo inicial de 1000 y número de cuenta 123456789
    CuentaBancaria cuenta(123456789, 1000);
    
    // Imprimimos el saldo actual de la cuenta
    std::cout << "El saldo actual es: " << cuenta.getSaldo() << std::endl;
    
    // Deposito 500 en la cuenta
    cuenta.depositar(500);
    
    // Imprimimos el saldo actual de la cuenta
    std::cout << "El saldo actual es: " << cuenta.getSaldo() << std::endl;
    
    // Retiro 200 de la cuenta
    cuenta.retirar(200);
    
    // Imprimimos el saldo actual de la cuenta
    std::cout << "El saldo actual es: " << cuenta.getSaldo() << std::endl;
    
    return 0;
}