public class GetterySetter {

    // Atributos (privados para encapsulamiento)
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para el atributo "nombre"
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo "nombre"
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo "edad"
    public int getEdad() {
        return edad;
    }

    // Setter para el atributo "edad"
    public void setEdad(int edad) {
        // Validamos la edad (ejemplo)
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Método toString (para mostrar la información de la persona)
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
