class GestorDeInventario:
    def __init__(self):
        self.inventario = {}

    def agregar_producto(self, producto):
        self.inventario[producto] = producto.cantidad

    def actualizar_inventario(self, pedido):
        for i in range(len(pedido.productos)):
            self.inventario[pedido.productos[i]] -= pedido.cantidades[i]