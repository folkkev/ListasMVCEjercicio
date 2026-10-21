package Controlador;
import Vista.*;
import Modelo.*;

public class Main {
    public static void main (String[] args) {

        int opcion;
        Mensajes.QueListaUsar();
        opcion = PedirNumeros.pedirNumero("elija una opcion\n");


        if (opcion == 1) {
            int[] ListaCreada = PedirNumeros.pedir10Numeros();
            int opcionElejida;

            do {
                Mensajes.opciones();
                opcionElejida = PedirNumeros.pedirNumero("elija una opcion\n");

                switch (opcionElejida) {
                    case 1:
                        Mensajes.mostrarLista(ListaCreada);
                        break;
                    case 2:
                        Mensajes.mostrarLista(ListaCreada);
                        int PosicionCambio = PedirNumeros.pedirNumero("ingrese la posicion que desea cambiar");
                        int NuevoNumero = PedirNumeros.pedirNuevoValor();
                        Actualizar.modificarDato(ListaCreada, PosicionCambio, NuevoNumero);
                        Mensajes.mostrarLista(ListaCreada);
                        break;
                    case 3:
                        int PosicionEliminar = PedirNumeros.pedirNumero("ingrese la posicion que desea eliminar");
                        int[] NuevaLista = Eliminar.eliminarDato(ListaCreada, PosicionEliminar);
                        Mensajes.mostrarLista(NuevaLista);
                        break;
                    case 4:
                        int suma = Sumatoria.calcularSuma(ListaCreada);
                        Mensajes.ImprimirMensajes("la sumatoria es: " + suma);
                        break;
                    case 5:
                        break;
                    default:
                        Mensajes.ImprimirMensajes("opcion no valida");
                        break;
                }
            } while (opcionElejida != 5);
        }

        else if (opcion == 2) {
            int[] ListaAleatoria = Crear.generarAleatorios();
            int opcionElejida;

            do {
                Mensajes.opciones();
                opcionElejida = PedirNumeros.pedirNumero("elija una opcion\n"); // Se pide la opción dentro

                switch (opcionElejida) {
                    case 1:
                        Mensajes.mostrarLista(ListaAleatoria);
                        break;
                    case 2:
                        Mensajes.mostrarLista(ListaAleatoria);
                        int PosicionCambio = PedirNumeros.pedirNumero("ingrese la posicion que desea cambiar");
                        int NuevoNumero = PedirNumeros.pedirNuevoValor();
                        Actualizar.modificarDato(ListaAleatoria, PosicionCambio, NuevoNumero);
                        Mensajes.mostrarLista(ListaAleatoria);
                        break;
                    case 3:
                        int PosicionEliminar = PedirNumeros.pedirNumero("ingrese la posicion que desea eliminar");
                        int[] NuevaLista = Eliminar.eliminarDato(ListaAleatoria, PosicionEliminar);
                        Mensajes.mostrarLista(NuevaLista);
                        break;
                    case 4:
                        int suma = Sumatoria.calcularSuma(ListaAleatoria);
                        Mensajes.ImprimirMensajes("la sumatoria es: " + suma);
                        break;
                    case 5:

                        break;
                    default:
                        Mensajes.ImprimirMensajes("opcion no valida");
                        break;
                }
            } while (opcionElejida != 5);
        }
        else {
            Mensajes.ImprimirMensajes("opcion no valida");
        }
    }
}