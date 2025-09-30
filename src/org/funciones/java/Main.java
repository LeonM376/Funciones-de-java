public class Main {
    public static void main(String[] args) {
        // Crear un objeto Persona
        GetterySetter persona1 = new GetterySetter("Juan", 30);

        // Usar el getter para obtener el nombre
        String nombre = persona1.getNombre();
        System.out.println("Nombre: " + nombre); // Salida: Nombre: Juan

        // Usar el getter para obtener la edad
        int edad = persona1.getEdad();
        System.out.println("Edad: " + edad); // Salida: Edad: 30

        // Usar el setter para cambiar el nombre
        persona1.setNombre("Pedro");

        // Usar el setter para cambiar la edad (con validación)
        persona1.setEdad(35);
        persona1.setEdad(-5); // Prueba la validación

        // Mostrar la información actualizada usando toString()
        System.out.println(persona1); // Salida: Nombre: Pedro, Edad: 35
    }
}
