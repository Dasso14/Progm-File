class GeneradorDeReportes:
    def __init__(self, gestor_inventario):
        self.gestor_inventario = gestor_inventario

    def reporte_ventas(self, pedidos):
        total_ventas = sum([sum(pedido.productos[i].precio * pedido.cantidades[i] for i in range(len(pedido.productos))) for pedido in pedidos])
        return f"Total de ventas: {total_ventas} soles"

    def reporte_inventario(self):
        return "\n".join([f"{producto.nombre}: {cantidad}" for producto, cantidad in self.gestor_inventario.inventario.items()])
