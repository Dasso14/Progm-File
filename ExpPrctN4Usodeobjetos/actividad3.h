#include <iostream>
#include <string>
#include <vector>
#pragma once
using namespace std;

class Wheel {
    private:
        int size;

    public:
        Wheel(int s) {
            size = s;
        }

        int getSize() {
            return size;
        }
};

class Car {
    private:
        Wheel wheel1;
        Wheel wheel2;
        Wheel wheel3;
        Wheel wheel4;

    public:
        Car(int size) : wheel1(size), wheel2(size), wheel3(size), wheel4(size) {
            // Constructor del carro que crea cuatro objetos de la clase de rueda con el tamaño dado.
        }

        void move() {
            cout << "El carro se está moviendo." << endl;
        }

        void changeWheels(int newSize) {
            wheel1 = Wheel(newSize);
            wheel2 = Wheel(newSize);
            wheel3 = Wheel(newSize);
            wheel4 = Wheel(newSize);

            cout << "Las ruedas del carro han sido cambiadas." << endl;
        }
};

int main() {
    Car car(18); // Crear un objeto del carro con ruedas de tamaño 18.
    car.move(); // Mover el carro.
    car.changeWheels(20); // Cambiar las ruedas del carro a tamaño 20.
    return 0;
}

/*
Wheel myWheel(18); // Crea una rueda de tamaño 18.
cout << "El tamaño actual de la rueda es " << myWheel.getSize() << endl; // Imprime "El tamaño actual de la rueda es 18".
myWheel.setSize(20); // Cambia el tamaño de la rueda a 20.
cout << "El nuevo tamaño de la rueda es " << myWheel.getSize() << endl; // Imprime "El nuevo tamaño de la rueda es 20".
*/