#include <iostream>
#include <string>
#include <vector>
#pragma once
using namespace std;

class Tienda{
public:
    std::string nombre;
    std::string direccion;
    std::string tipo;
    std::vector<std::string> productos;

    Tienda(std::string n, std::string dir, std::string t) {
        nombre = n;
        direccion = dir;
        tipo = t;
    }

    void venderProducto(std::string p) {
        std::cout << "Se vendió el producto " << p << std::endl;
        // Eliminamos el producto vendido del vector de productos
        for (int i = 0; i < productos.size(); i++) {
            if (productos[i] == p) {
                productos.erase(productos.begin() + i);
                break;
            }
        }
    }

    void agregarProducto(std::string p) {
        std::cout << "Se agregó el producto " << p << std::endl;
        productos.push_back(p);
    }
};

int main() {
    Tienda tienda("Mi tienda", "Calle Principal 123", "Ropa");
    tienda.agregarProducto("Pantalones");
    tienda.agregarProducto("Camisetas");
    tienda.venderProducto("Pantalones");
    return 0;
}