public class Main {

    public static void main(String[] args) {

        Boiler boiler = Boiler.getInstancia();

        boiler.mostrarEstado();

        System.out.println("\n--- Llenando ---");
        boiler.llenar();

        System.out.println("\n--- Iniciando mezcla ---");
        boiler.iniciarMezcla();

        System.out.println("\n--- Intentando llenar nuevamente ---");
        boiler.llenar();

        System.out.println("\n--- Vaciando ---");
        boiler.vaciar();

        System.out.println("\n--- Estado final ---");
        boiler.mostrarEstado();
    }
}
