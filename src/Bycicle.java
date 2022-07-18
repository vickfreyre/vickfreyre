public class Bycicle {
    int ritmo = 0;
    int velocidad = 0;
    int cambio = 1;

    void cambiarRitmo(int nuevoValor) {
        ritmo = nuevoValor;
    }

    void cambiarVelocidad(int nuevoValor) {
        cambio = nuevoValor;
    }

    void acelerar(int incremento) {
        velocidad = velocidad + incremento;
    }

    void frenar(int decremento) {
        velocidad = velocidad - decremento;
    }

    void mostrarEstados() {
        System.out.println("ritmo: " + ritmo + " velocidad:" + velocidad + " cambio:" + cambio);
    }
}