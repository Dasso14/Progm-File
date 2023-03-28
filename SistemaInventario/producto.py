class Producto:
    def __init__(self, nombre, precio, cantidad, descripcion):
        self.nombre = nombre
        self.precio = precio
        self.cantidad = cantidad
        self.descripcion = descripcion

def agregar_producto(gestor_inventario):
    nombre = input("Ingrese el nombre del producto: ")
    precio = float(input("Ingrese el precio del producto: "))
    cantidad = int(input("Ingrese la cantidad disponible del producto: "))
    descripcion = input("Ingrese la descripción del producto: ")
    producto = Producto(nombre, precio, cantidad, descripcion)
    gestor_inventario.agregar_producto(producto)
    print(f"El producto {nombre} ha sido agregado al inventario")