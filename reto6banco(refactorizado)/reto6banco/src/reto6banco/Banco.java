package reto6banco;

import java.util.Enumeration;
import java.util.Hashtable;
import static reto6banco.Utileria.ingresoInt;
import static reto6banco.Utileria.ingresoString;


public class Banco {
   private Hashtable<Integer, Cliente> clientes = new Hashtable<Integer, Cliente>(); //cuentas de los clientes guardadas

    

    public void borrarCliente(Integer cedula) { //borrar la cuenta del cliente 
        clientes.remove(cedula);
        System.out.println("El cliente fue eliminado de los registros. ");
    }

    public void adicionarArticulo(Integer cedula) { //guardamos un articulo a nombre del cliente  
        clientes.get(cedula).getArticulos().add(new Articulo(ingresoString("Ingrese el nombre del articulo: "),ingresoString("Ingrese una breve descripción del articulo: "), Double.parseDouble(ingresoString("Ingrese un valor aproximado del articulo(USD): "))));
        System.out.println("El articulo del cliente " + clientes.get(cedula).getNombre() + " fue almacenado.");
    }

    public void eliminarArticulo(Integer cedula) { //eliminamos un articulo del cliente 
        clientes.get(cedula).mostrarArticulos(); // mostramos todos los articulos del cliente 
        clientes.get(cedula).getArticulos().remove(ingresoInt("¿cuál articulo deseea eliminar?: ") - 1);
        System.out.println("Articulo eliminado");
    }

    public void sumarCliente(Integer cedula) { //sumamos el precio estimado de un cliente especifico 
        int suma = 0;
        for (int i = 0; i < clientes.get(cedula).getArticulos().size(); i++) {
            suma += clientes.get(cedula).getArticulos().get(i).getValorEstimado(); 
        }
        System.out.println("La suma de los articulos almacenados por el cliente es " + suma + " USD");
    }

    public void sumarClientes() { 
        int suma = 0; 
        Enumeration<Cliente> elementos = clientes.elements(); //tomamos la enumeracion del hashTable
        while (elementos.hasMoreElements()) { //comprobamos si la enumeracion del hashtable aun sigue dentro del rango
            Cliente apuntador = elementos.nextElement();//tomamos el siguiente cliente empezando desde el primero (cliente n)
            for (int i = 0; i < apuntador.getArticulos().size(); i++) { //recorremos todos los articulos que el cliente n tenga
                suma += apuntador.getArticulos().get(i).getValorEstimado(); //sumamos el precio estimado de los i articulos del cliente n
            }
        }
        System.out.println("la suma de todos los articulos guardados en este banco es de: " + suma + " USD");
    }
    public Hashtable<Integer, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Hashtable<Integer, Cliente> clientes) {
        this.clientes = clientes;
    }

    public void agregarCliente() {
        new Cliente().Registrar(clientes);
    }

    public void mostrarCliente(Integer cedula) {                            
        System.out.println(clientes.get(cedula).toString());

    }

    @Override
    public String toString() {
        return "Banco{clientes: " + clientes + '}';
    }

}
