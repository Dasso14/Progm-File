#include <iostream>
#include <string>
#include <ctime>
#include "trabajador.h"
#include "empresa.h"
#include "reportes.h"

using namespace std;

int main() {
    Empresa empresa("Mi Empresa", 123456789);
    int dni;
    string nombre;
    int opcion = 0;
    while (true)
    {
        cout << "-----------------------" << endl;
        cout << "Bienvenido al sistema de control de asistencia" << endl;
        cout << "-----------------------" << endl;
        cout << "1. Registrar nuevo empleado" << endl;
        cout << "2. Registrar entrada de empleado" << endl;
        cout << "3. Registrar inasistencia de empleado" << endl;
        cout << "4. Mostrar reporte de asistencia" << endl;
        cout << "5. Salir del sistema" << endl;
        cout << "-----------------------" << endl;
        cout << "Ingrese el numero de opcion que desea: ";
        cin >> opcion;
        cout << "-----------------------" << endl;

        switch (opcion)
        {
            case 1:
                cout << "-----------------------" << endl;
                cout << "REGISTRAR NUEVO EMPLEADO" << endl;
                cout << "-----------------------" << endl;
                cout << "Ingrese el nombre del empleado: ";
                cin >> nombre;
                cout << "Ingrese el DNI del empleado: ";
                cin >> dni;
                Trabajador *nuevo_trabajador = new Trabajador(nombre, dni);
                empresa.contratar(nuevo_trabajador);
                cout << "-----------------------" << endl;
                cout << "Trabajador contratado exitosamente" << endl;
                cout << "Cantidad de trabajadores en la empresa: " << empresa.getCantTrabajadores() << endl;
                cout << "-----------------------" << endl;
                break;
            case 2:
                cout << "-----------------------" << endl;
                cout << "REGISTRAR ENTRADA DE EMPLEADO" << endl;
                cout << "-----------------------" << endl;
                registrarEntradaEmpresa(empresa);
                cout << "-----------------------" << endl;
                break;
            case 3:
                cout << "-----------------------" << endl;
                cout << "REGISTRAR INASISTENCIA DE EMPLEADO" << endl;
                cout << "-----------------------" << endl;
                registrarInasistencia(empresa);
                cout << "-----------------------" << endl;
                break;
            case 4:
                cout << "-----------------------" << endl;
                cout << "MOSTRAR REPORTE DE ASISTENCIA" << endl;
                cout << "-----------------------" << endl;
                mostrarReporte(empresa);
                cout << "-----------------------" << endl;
                break;
            case 5:
                cout << "Saliendo del sistema" << endl;
                break;
            default:
                cout << "Opcion invalida, por favor ingrese un numero valido." << endl;
                break;
        }
        if (opcion == 5) {
        break;
        } 
    }
}

/*
while (opcion != 5)
    {
        cout << "-----------------------" << endl;
        cout << "Bienvenido al sistema de control de asistencia" << endl;
        cout << "-----------------------" << endl;
        cout << "1. Registrar nuevo empleado" << endl;
        cout << "2. Registrar entrada de empleado" << endl;
        cout << "3. Registrar inasistencia de empleado" << endl;
        cout << "4. Mostrar reporte de asistencia" << endl;
        cout << "5. Salir del sistema" << endl;
        cout << "-----------------------" << endl;
        cout << "Ingrese el numero de opcion que desea: ";
        cin >> opcion;
        cout << "-----------------------" << endl;

        
        if (opcion==1)
        {
            cout << "-----------------------" << endl;
            cout << "REGISTRAR NUEVO EMPLEADO" << endl;
            cout << "-----------------------" << endl;
            cout << "Ingrese el nombre del empleado: ";
            cin >> nombre;
            cout << "Ingrese el DNI del empleado: ";
            cin >> dni;
            Trabajador *nuevo_trabajador = new Trabajador(nombre, dni);
            empresa.contratar(nuevo_trabajador);
            cout << "-----------------------" << endl;
            cout << "Trabajador contratado exitosamente" << endl;
            cout << "Cantidad de trabajadores en la empresa: " << empresa.getCantTrabajadores() << endl;
            cout << "-----------------------" << endl;
        }
            if (opcion==2)
            {
                cout << "-----------------------" << endl;
                cout << "REGISTRAR ENTRADA DE EMPLEADO" << endl;
                cout << "-----------------------" << endl;
                registrarEntradaEmpresa(empresa);
                cout << "-----------------------" << endl;
            }
                if (opcion==3)
                {
                    cout << "-----------------------" << endl;
                    cout << "REGISTRAR INASISTENCIA DE EMPLEADO" << endl;
                    cout << "-----------------------" << endl;
                    registrarInasistencia(empresa);
                    cout << "-----------------------" << endl;
                }
                    if (opcion==4)
                    {
                        cout << "-----------------------" << endl;
                        cout << "MOSTRAR REPORTE DE ASISTENCIA" << endl;
                        cout << "-----------------------" << endl;
                        mostrarReporte(empresa);
                        cout << "-----------------------" << endl;
                    }
                        if (opcion==5)
                        {
                            cout << "Saliendo del sistema" << endl;
                        }
        else
        {
            cout << "Opcion invalida, por favor ingrese un numero valido." << endl;
        }
        return 0;
    }
*/