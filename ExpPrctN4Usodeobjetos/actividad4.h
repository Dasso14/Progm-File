#include <iostream>
#include <string>
#include <vector>
#pragma once
using namespace std;

class Product {
    private:
        string name;
        double price;

    public:
        Product(string n, double p) {
            name = n;
            price = p;
        }

        string getName() {
            return name;
        }

        double getPrice() {
            return price;
        }
};

class Store {
    private:
        vector<Product> inventory;
        vector<vector<Product>> sales;
    public:
        Store() {
            inventory.push_back(Product("Pantalón", 25.99));
            inventory.push_back(Product("Camisa", 15.50));
            inventory.push_back(Product("Zapatos", 42.75));
            inventory.push_back(Product("Corbata", 8.99));
        }
        vector<Product> getInventory() {
            return inventory;
        }
        void addProduct(Product p) {
            inventory.push_back(p);
            cout << "Producto agregado al inventario." << endl;
        }
        void displayInventory() {
            cout << "Inventario:" << endl;
            for (int i = 0; i < inventory.size(); i++) {
                cout << inventory[i].getName() << " - " << inventory[i].getPrice() << " dólares." << endl;
            }
        }
        void makeSale(vector<Product> cart) {
            sales.push_back(cart);
            cout << "Venta realizada con éxito." << endl;
        }
};

class Customer {
    private:
        vector<Product> cart;
        double balance;

    public:
        Customer(double b) {
            balance = b;
        }

        void addToCart(Product p) {
            cart.push_back(p);
            cout << "Producto añadido al carrito." << endl;
        }

        void displayCart() {
            cout << "Carrito de compras:" << endl;
            for (int i = 0; i < cart.size(); i++) {
                cout << cart[i].getName() << " - " << cart[i].getPrice() << " dólares." << endl;
            }
        }

        void checkout(Store& s) {
            double total = 0;
            for (int i = 0; i < cart.size(); i++) {
                total += cart[i].getPrice();
            }

            if (total > balance) {
                cout << "No tienes suficiente dinero para comprar estos productos." << endl;
                return;
            }

            balance -= total;
            s.makeSale(cart);
            cart.clear();
            cout << "Compra realizada con éxito." << endl;
        }
};

int main() {
    Store myStore;
    myStore.displayInventory();

    Customer myCustomer(50.0);
    myCustomer.addToCart(myStore.getInventory()[0]);
    myCustomer.addToCart(myStore.getInventory()[1]);
    myCustomer.displayCart();
    myCustomer.checkout(myStore);

    return 0;
}
 /*
 int main() {
    list<int> myList;

    myList.push_back(10);
    myList.push_back(20);
    myList.push_back(30);

    for (int x : myList) {
        cout << x << " ";
    }
    cout << endl;

    return 0;
}
 */