#include <iostream>
#pragma once

using namespace std;
struct  producto
{
    int codigo;
    int cantidad;
    float precio;
    string nombre;

    void ingresar();
    void imprimir();
};

void producto::ingresar()
{
    cout<<"CODIGO: ";
    cin>>codigo;
    cout<<"CANTIDAD: ";
    cin>>cantidad;
    cout<<"PRECIO: ";
    cin>>precio;
    cout<<"NOMBRE: ";
    cin>>nombre;

}

void producto::imprimir()
{
    cout<<"CODIGO: "<<codigo<<endl;
    cout<<"CANTIDAD: "<<cantidad<<endl;
    cout<<"PRECIO: S/"<<precio<<endl;
    cout<<"NOMBRE: "<<nombre<<endl;
}