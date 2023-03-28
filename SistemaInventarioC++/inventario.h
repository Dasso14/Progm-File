#pragma once
#include "producto.h"

struct inventario
{
    producto list[2];
    int numero;
    void ingresar();
    void imprimir();
};

void inventario::ingresar()
{
    cout<<"Ingrese el numero de productos: "<<endl;
    cin>>numero;
    for (int i = 0; i < numero; i++)
    {
        cout<<"Ingresar producto: "<<endl;
        list[i].ingresar();
    }
    
}

void inventario::imprimir()
{
    cout<<"Lista de productos: "<<endl;
    for (int i = 0; i < numero; i++)
    {
        list[i].imprimir();
    }
    
}
