
package CasoCine;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("                   CINE COLOMBIA                 ");
        System.out.println("=================================================\n");

        // Instanciar objetos
        FuncionEstreno funcionEstreno1 = new FuncionEstreno("Toy Story 67", "Sala VIP 1", 5, 0.0, 5000.0);
        FuncionNormal funcionNormal1 = new FuncionNormal("Avengers: Doomsday", "Sala 3", 10, 0.0);

        // Modificar datos con los metodos set
        System.out.println("--- MODIFICANDO DATOS ---");
        funcionNormal1.setTituloPelicula("Avengers: Doomsday (Especial)");
        funcionNormal1.setSala("Sala 5");
        funcionEstreno1.setSala("Sala VIP 2");
        funcionEstreno1.setRecargoEstreno(6000.0);
        System.out.println("Datos modificados correctamente.");

        // Pruebas de validacion (deben mostrar mensajes de error)
        System.out.println("\n--- PRUEBAS DE VALIDACION ---");
        funcionNormal1.setAsientosOcupados(-5);
        funcionNormal1.setRecaudacion(-1000);
        funcionEstreno1.setRecargoEstreno(-100);
        funcionNormal1.venderEntradas(-3);
        funcionNormal1.venderEntradas(100);

        // Simulacion de venta / reserva de entradas
        System.out.println("\n--- VENTA DE ENTRADAS ---");
        funcionNormal1.venderEntradas(15);
        funcionEstreno1.setAsientosOcupados(12);
        System.out.println("Reserva de 12 asientos registrada en la funcion de estreno.");

        // Resultados con los metodos get
        System.out.println("\n=================================================");
        System.out.println("               RESULTADOS FINALIZADOS               ");
        System.out.println("=================================================");

        System.out.println("\n--- FUNCION NORMAL ---");
        System.out.println("Pelicula: " + funcionNormal1.getTituloPelicula());
        System.out.println("Sala: " + funcionNormal1.getSala());
        System.out.println("Asientos Ocupados: " + funcionNormal1.getAsientosOcupados());
        System.out.println("Asientos Disponibles: " + funcionNormal1.getAsientosDisponibles());
        System.out.println("Recaudacion Total: $" + funcionNormal1.getRecaudacion() + " COP");

        System.out.println("\n--- FUNCION DE ESTRENO ---");
        System.out.println("Pelicula: " + funcionEstreno1.getTituloPelicula());
        System.out.println("Sala: " + funcionEstreno1.getSala());
        System.out.println("Asientos Ocupados: " + funcionEstreno1.getAsientosOcupados());
        System.out.println("Recargo por Estreno: $" + funcionEstreno1.getRecargoEstreno() + " COP");
        System.out.println("Recaudacion Total: $" + funcionEstreno1.getRecaudacion() + " COP");
    }
}