#include <iostream>
#include <string>
#include <vector>
#pragma once
using namespace std;

class Producto {
private:
    string nombre;
    float precio;
    int cantidad;
public:
    Producto(string nombre, float precio, int cantidad) {
        this->nombre = nombre;
        this->precio = precio;
        this->cantidad = cantidad;
    }
    void setPrecio(float precio) {
        this->precio = precio;
    }
    float getPrecio() {
        return precio;
    }
    void setCantidad(int cantidad) {
        this->cantidad = cantidad;
    }
    int getCantidad() {
        return cantidad;
    }
};

class Factura {
private:
    int numero;
    string fecha;
    vector<Producto> productos;
public:
    Factura(int numero, string fecha) {
        this->numero = numero;
        this->fecha = fecha;
    }
    void agregarProducto(Producto producto) {
        productos.push_back(producto);
    }
    void imprimir() {
        cout << "Factura #" << numero << endl;
        cout << "Fecha: " << fecha << endl;
        cout << "Productos: " << endl;
        float total = 0;
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos[i];
            cout << producto.getCantidad() << " x " << producto.getPrecio() << " = " << producto.getCantidad() * producto.getPrecio() << endl;
            total += producto.getCantidad() * producto.getPrecio();
        }
        cout << "Total: " << total << endl;
    }
};

int main() {
    Producto producto1("Producto 1", 10.5, 2);
    Producto producto2("Producto 2", 5.75, 3);
    Factura factura(1, "01/01/2022");
    factura.agregarProducto(producto1);
    factura.agregarProducto(producto2);
    factura.imprimir();
}

/*// Crear un objeto de la clase de producto
Producto producto1;
producto1.setNombre("Producto 1");
producto1.setPrecio(10.0);
producto1.setCantidad(5);

// Agregar el objeto a la lista de productos en la clase de factura
factura1.agregarProducto(producto1);
*/