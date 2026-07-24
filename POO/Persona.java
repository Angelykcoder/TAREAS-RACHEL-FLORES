package POO;

public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Constructor 1: Solo con nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Constructor 2: Con nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Persona -> Nombre: " + nombre + " | Edad: " + edad);
    }
}