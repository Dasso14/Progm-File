package RelacionEntreClases.Asociacion;

import java.util.Arrays;

import RelacionEntreClases.Composicion.Persona;

public class Banco {
    private String nombre;
    private Persona clientes[];

    public Banco (String nombre){
        this(nombre, 20);
    }
    public Banco (String nombre, int numCli){
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Persona[] getClientes() {
        return clientes;
    }
    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }
    

    public void agregarCliente(Persona persona){
        if (persona == null) {
            System.out.println("No se puede agregar un cliente nulo.");
            return;
        }

        // Verificar si el cliente ya existe
        if (buscarCliente(persona)) {
            System.out.println("El cliente ya existe en el banco.");
            return;
        }

        // Verificar capacidad del arreglo
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = persona;
                System.out.println("Cliente agregado exitosamente.");
                return;
            }
        }
        System.out.println("El banco está lleno, no se puede agregar más clientes.");
    }
    public Persona darBajaCliente(Persona persona){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                Persona clienteEliminado = clientes[i];
                clientes[i] = null;
                return clienteEliminado;
            }
        }
        return null;
    }
    public boolean buscarCliente (Persona persona){
        for (Persona cliente : clientes) {
            if (cliente != null && cliente.equals(persona)) {
                return true;
            }
        }
        return false;
    }
    public void clientesTipo (char tipo){
        //agregue implementacion
        for (Persona cliente : clientes) {
            if (cliente != null && cliente.getTipo() == tipo) {
                System.out.println(cliente);
            }
        }
    }


    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", clientes=" + Arrays.toString(clientes) + "]";
    }
}
