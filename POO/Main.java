package POO;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE PERSONAS ===");
        Persona p1 = new Persona("Carlos"); // Usando constructor 1
        p1.edad = 25; // Asignar edad manualmente
        System.out.println("Nombre desde el objeto: " + p1.nombre);
        p1.mostrarDatos();

        // Crear varios objetos Persona
        Persona p2 = new Persona("Ana", 30); // Usando constructor 2
        Persona p3 = new Persona("Luis", 19);
        p2.mostrarDatos();
        p3.mostrarDatos();


        System.out.println("\n=== PRUEBA DE AUTOS ===");
        Auto auto1 = new Auto("Toyota");
        Auto auto2 = new Auto("Ford");

        auto1.acelerar(80);
        auto1.frenar(20);
        auto1.mostrarVelocidad();

        auto2.acelerar(100);
        auto1.compararVelocidad(auto2); // Comparar dos autos


        System.out.println("\n=== PRUEBA DE PRODUCTOS ===");
        // Crear varios productos
        Producto prod1 = new Producto("Laptop", 850.50);
        Producto prod2 = new Producto("Mouse", 15.00);
        Producto prod3 = new Producto("Teclado", 45.90);

        prod1.mostrarProducto();
        prod2.mostrarProducto();
        prod3.mostrarProducto();


        System.out.println("\n=== PRUEBA DE CUENTAS BANCARIAS ===");
        // Crear varios objetos cuenta
        Cuenta cuenta1 = new Cuenta(500.0);
        Cuenta cuenta2 = new Cuenta(100.0);

        cuenta1.mostrarSaldo();
        cuenta1.depositar(200.0);
        cuenta1.retirar(1000.0); // Intento de retirar más de lo disponible (debe fallar)
        cuenta1.retirar(300.0);  // Retiro válido

        System.out.println("---");
        cuenta2.mostrarSaldo();
        cuenta2.depositar(50.0);
    }
}