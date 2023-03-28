#pragma once
#include "inventario.h"
 struct pedido
 {
    int producto;
    int cantidad;
    void ingresar();
    void imprimir();
    void buscar();
 };

 void pedido::buscar(producto x)
 {
    int c;
    for (int i = 0; i < this->cantidad; i++)
    {
        bool existe=false;
        if (x.codigo==lista[i].disminuir)
        {
            cout<<"Se hace pedido";
        }
        else
        {
            cout<<"No se hace pedido";
        }
    }
 }
 