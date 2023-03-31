#include <iostream>
#include <string>
#include "mision.h"
#include "avion.h"
using namespace std;

int main(){
    string Destino1;
    int oil;
    int oilcom;
    int time1;
    int passengers1;
    cout<<"------------Simulacion de Vuelo--------------"<<endl;
    cout<<"Ingrese lugar de destino: ";cin>>Destino1;
    cout<<"Ingrese Combustible del avion: ";cin>>oil;
    cout<<"Ingrese Comsumo de combustible: ";cin>>oilcom;
    cout<<"Ingrese duracion del vuelo: ";cin>>time1;
    cout<<"Ingrese cantidad de pasajeros: ";cin>>passengers1;
    Avion avion("Boeing 747", oil, oilcom);
    Mision mision(Destino1, time1, passengers1);
    
    avion.simularMision(mision);
    
    return 0;
}