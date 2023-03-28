from generadorReportes import*
from inventario import*
from pedido import*
from producto import*

gestor_inventario = GestorDeInventario()
generador_reportes = GeneradorDeReportes(gestor_inventario)
pedidos = []
while True:
    print("\n----- Menú -----")
    print("1. Agregar producto al inventario")
    print("2. Hacer un pedido")
    print("3. Generar reporte de ventas")
    print("4. Generar reporte de inventario")
    print("5. Salir")
    opcion = input("Ingrese una opción: ")
    if opcion == "1":
        agregar_producto(gestor_inventario)
    elif opcion == "2":
        pedido = hacer_pedido(gestor_inventario)
        if pedido is not None:
            pedidos.append(pedido)
    elif opcion == "3":
        print(generador_reportes.reporte_ventas(pedidos))
    elif opcion == "4":
        print(generador_reportes.reporte_inventario())
    elif opcion == "5":
        break
    else:
            print("Opción inválida")