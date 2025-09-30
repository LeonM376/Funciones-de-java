public class toString {

    // Atributos
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Constructor
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // Método toString() (Sobreescribimos el método de la clase Object)
    @Override
    public String toString() {
        return "Producto: " + nombre + "\n" +
               "Precio: $" + String.format("%.2f", precio) + "\n" + // Formateamos el precio
               "Cantidad en stock: " + cantidadEnStock;
    }

    // Getters (para acceder a los atributos)
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    // Setters (para modificar los atributos)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
}
