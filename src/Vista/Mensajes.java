package Vista;

public class Mensajes {
    public static void ImprimirMensajes(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarLista(int[] numeros) {
        System.out.println("Lista Actual");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println( (i+1) + ")" + numeros[i]);
        }
    }
    public static void opciones(){
        System.out.println("\n1)Ver Lista"+"\n2)Cambiar numero de la Lista"+"\n3)Eliminar un numero de la lista"+"\n4)Sumar elementos de la lista"+"\n5)Salir del programa");

    }
    public static void QueListaUsar(){
        System.out.println("\n1)Crear la lista"+"\n2)Llenar con numeros aleatorios");
    }
}
