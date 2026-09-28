public class Boiler {

    private boolean vacio;
    private boolean resistenciaEncendida;

    // Única instancia del Boiler
    private static Boiler instancia;

    private Boiler() {
        vacio = true;
        resistenciaEncendida = false;
    }

    public static Boiler getInstancia() {
        if (instancia == null) {
            instancia = new Boiler();
        }

        return instancia;
    }

    public void llenar() {
        if (vacio && !resistenciaEncendida) {
            vacio = false;
            System.out.println("El boiler se ha llenado con chocolate, un niño y leche.");
        } else {
            System.out.println(
                "No se puede llenar: el boiler debe estar vacío " +
                "y la resistencia apagada."
            );
        }
    }

    public void iniciarMezcla() {
        if (!vacio && !resistenciaEncendida) {
            resistenciaEncendida = true;
            System.out.println("La resistencia se ha encendido.");
            System.out.println("El boiler ha iniciado el proceso de mezcla.");
        } else {
            System.out.println(
                "No se puede iniciar la mezcla: el boiler debe estar lleno " +
                "y la resistencia apagada."
            );
        }
    }

    public void vaciar() {
        if (!vacio && resistenciaEncendida) {
            vacio = true;
            resistenciaEncendida = false;
            System.out.println("El boiler se ha vaciado.");
            System.out.println("La resistencia se ha apagado.");
        } else {
            System.out.println(
                "No se puede vaciar: el boiler debe estar lleno " +
                "y la resistencia encendida."
            );
        }
    }

    // Consultar estado por si acaso
    public void mostrarEstado() {
        System.out.println("Boiler vacío: " + vacio);
        System.out.println(
            "Resistencia encendida: " + resistenciaEncendida
        );
    }
}
