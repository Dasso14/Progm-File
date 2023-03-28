class Pedido:
    def __init__(self, productos, cantidades):
        self.productos = productos
        self.cantidades = cantidades

def hacer_pedido(gestor_inventario):
    productos = []
    cantidades = []
    while True:
        nombre_producto = input("Ingrese el nombre del producto a comprar (o 'fin' para terminar): ")
        if nombre_producto == "fin":
            break
        if nombre_producto not in [producto.nombre for producto in gestor_inventario.inventario.keys()]:
            print(f"El producto {nombre_producto} no está disponible")
            continue
        cantidad = int(input(f"Ingrese la cantidad de unidades de {nombre_producto} que desea comprar: "))
        productos.append([producto for producto in gestor_inventario.inventario.keys() if producto.nombre == nombre_producto][0])
        cantidades.append(cantidad)
    pedido = Pedido(productos, cantidades)
    if all([pedido.productos[i].cantidad >= pedido.cantidades[i] for i in range(len(pedido.productos))]):
        print("El pedido se ha realizado exitosamente")
        gestor_inventario.actualizar_inventario(pedido)
        return pedido
    else:
        print("No hay suficientes unidades de algún producto para completar el pedido")
        return None
