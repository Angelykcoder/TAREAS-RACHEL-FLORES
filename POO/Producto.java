package POO;

public class Producto {
    // Atributos
    String nombre;
    double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para mostrar producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}