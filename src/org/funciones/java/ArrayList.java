import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList
        ArrayList<String> listaNombres = new ArrayList<>();

        // Agregar elementos
        listaNombres.add("Juan");
        listaNombres.add("María");
        listaNombres.add("Pedro");

        // Acceder a un elemento
        System.out.println("Primer nombre: " + listaNombres.get(0));

        // Modificar un elemento
        listaNombres.set(1, "Ana");

        // Eliminar un elemento
        listaNombres.remove("Pedro");

        // Mostrar todos los nombres
        System.out.println("Lista de nombres:");
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }

        // Tamaño del ArrayList
        System.out.println("Tamaño de la lista: " + listaNombres.size());
    }
}
