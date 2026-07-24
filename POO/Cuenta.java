package POO;

public class Cuenta {
    // Atributo
    double saldo;

    // Constructor
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Métodos
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de $" + monto + ". Nuevo saldo: $" + saldo);
        }
    }

    public void retirar(double monto) {
        // Validar que no retire más de lo disponible
        if (monto > saldo) {
            System.out.println("Error: Saldo insuficiente para retirar $" + monto + ". (Disponible: $" + saldo + ")");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto + ". Saldo restante: $" + saldo);
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual en la cuenta: $" + saldo);
    }
}