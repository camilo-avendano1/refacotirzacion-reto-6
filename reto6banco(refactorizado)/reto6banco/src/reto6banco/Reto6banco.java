package reto6banco;

import java.util.InputMismatchException;
import static reto6banco.Utileria.ingresoInt;
import static reto6banco.Utileria.ingresoInteger;

public class Reto6banco {

    public static void main(String[] args) {
        Banco banco = new Banco();

        int opcion = -1;
        while (opcion != 0) {
            try {
                opcion = ingresoInt("\n\n!!!BIENVENIDO!!!!!!\n\n\n"
                 + "INGRESE UNA OPCIÓN DEL MENÚ:\n\n"    //menu
                 + "1) REGISTRAR UN CLIENTE.\n"
                 + "2) CONSULTAR CLIENTE. \n"
                 + "3) BORRAR CLIENTE. \n"
                 + "4) AGREGAR ARTICULO AL CLIENTE\n"
                 + "5) ELIMINAR ARTICULOS A CLIENTE\n"
                 + "6) MOSTRAR VALOR ESTIMADO ARTICULOS DE UN CLIENTE\n"
                 + "7) MOSTRAR VALOR ESTIMADO DE TODOS LOS ARTICULOS DE LOS CLIENTES\n"
                 + "0) SALIR\n");
            } catch (InputMismatchException e) { //excepcion en caso de que se ingrese en opcion una letra en lugar de un numero.
                System.out.println("Usted a ingresado una opción invalida por favor ingrese nuevamente.");
            }
            try {
                switch (opcion) {

                    case 1:
                        banco.agregarCliente(); //ingresamos un cliente 
                        break;
                    case 2:
                        banco.mostrarCliente(ingresoInteger("Ingrese la cedula del cliente a consultar: ")); //mostramos un cliente ingresando la cedula
                        break;
                    case 3:
                        banco.borrarCliente(ingresoInteger("Ingrese la cedula del cliente que desea eliminar: ")); //eliminamos cliente según la cedula ingresada
                        break;
                    case 4:
                        banco.adicionarArticulo(ingresoInteger("Ingrese la cedula del cliente al cual desea almacenar un articulo: ")); //le guardamos un articulo al cliente con cedula 
                        break;
                    case 5:
                        banco.eliminarArticulo(ingresoInteger("Ingrese la cedula del cliente al cual desee descartarle un articulo: ")); //le borramos un articulo que elijamos al cliente con cedula
                        break;
                    case 6:
                        banco.sumarCliente(ingresoInteger("Ingrese la cedula del cliente al cual desea conocerle el precio total de todos sus articulos: ")); //sumamos el valor guardado del cliente con cedula 
                        break;
                    case 7:
                        banco.sumarClientes(); //sumamos la cantidad de valor guardado en el banco
                    case 0:
                        System.out.println("Muchas gracias por usar este programita :)");
                    default:
                        System.out.println("Por favor ingrese una opcion numerica que aparezca en el menú.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Has ingresado una opcion erronea! " + e.getMessage()); //si en lugar de un numero ingresa una letra
            } catch (NumberFormatException e1) {
                System.out.println("Has ingresado un numero de celular no valido! >:( " + e1.getMessage());// si ingresa una letra en lugar de un numero en el campo celular de registrar
            } catch (NullPointerException e2) {
                System.out.println("Este cliente esta registrado en nuestra base de datos :,( " + e2.getMessage()); //si ingresamos una cedula que no existe en el hashtable es decir en las cuentas registradas
            } catch (IndexOutOfBoundsException e3) { //en caso de que querramos eliminar o consultar un articulo de un cliente y este no se encuentre 
                System.out.println("Este articulo no esta registrado en nuestra base datos. " + e3.getMessage());
            }
        }

    }

}
