package RelacionEntreClases.Asociacion;

import RelacionEntreClases.Composicion.Persona;

public class TestAsociacion {
    public static void main (String[] args){
        Banco bcp = new Banco ("BCP");
        Banco bbva = new Banco ("BBVA", 30);

        //agregue clientes
        Persona cliente1 = new Persona(1, 1000.0, 101, "John", "Doe", 'A');
        Persona cliente2 = new Persona(2, 1500.0, 102, "Jane", "Smith", 'B');
        bcp.agregarCliente(cliente1);
        bbva.agregarCliente(cliente2);

        //elimine clientes
        if (bcp.buscarCliente(cliente1)) {
            System.out.println("Cliente 1 encontrado en el banco BCP.");
        } else {
            System.out.println("Cliente 1 no encontrado en el banco BCP.");
        }

        //liste los clientes por tipo
        System.out.println("Clientes de tipo 'A' en el banco BBVA:");
        bbva.clientesTipo('A');

        //busque a clientes
        System.out.println("Clientes en el banco BCP:");
        for (Persona cliente : bcp.getClientes()) {
            if (cliente != null) {
                System.out.println(cliente);
            }
        }
    }
}
