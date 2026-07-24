package POO;

public class Auto {
    // Atributos
    String marca;
    int velocidad;

    // Constructor
    public Auto(String marca) {
        this.marca = marca;
        this.velocidad = 0; // Inicia detenido
    }

    // Métodos
    public void acelerar(int incremento) {
        this.velocidad += incremento;
        System.out.println("El auto " + marca + " aceleró a " + velocidad + " km/h.");
    }

    public void frenar(int decremento) {
        this.velocidad -= decremento;
        if (this.velocidad < 0) this.velocidad = 0; // No velocidad negativa
        System.out.println("El auto " + marca + " frenó a " + velocidad + " km/h.");
    }

    public void mostrarVelocidad() {
        System.out.println("Velocidad actual de " + marca + ": " + velocidad + " km/h.");
    }

    // Método para comparar dos autos por su velocidad
    public void compararVelocidad(Auto otroAuto) {
        if (this.velocidad > otroAuto.velocidad) {
            System.out.println("El " + this.marca + " es más rápido que el " + otroAuto.marca);
        } else if (this.velocidad < otroAuto.velocidad) {
            System.out.println("El " + otroAuto.marca + " es más rápido que el " + this.marca);
        } else {
            System.out.println("Ambos autos van a la misma velocidad.");
        }
    }
}