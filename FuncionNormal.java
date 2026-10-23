
package CasoCine;

public class FuncionNormal extends FuncionCine {

    // Capacidad maxima de la sala (para gestionar disponibilidad)
    private static final int CAPACIDAD = 50;

    // CONSTRUCTOR PARAMETRIZADO
    public FuncionNormal(String tituloPelicula, String sala, int asientosOcupados, double recaudacion) {
        super(tituloPelicula, sala, asientosOcupados, recaudacion);
        calcularRecaudacion(); // tarifa base, sin recargos
    }

    // Asientos que todavia se pueden vender
    public int getAsientosDisponibles() {
        return CAPACIDAD - getAsientosOcupados();
    }

    // SIMULACION DE VENTA DE ENTRADAS
    public void venderEntradas(int cantidadBoletas) {
        if (cantidadBoletas <= 0) {
            System.out.println("ERROR: la cantidad de entradas a vender debe ser mayor a cero.");
        } else if (cantidadBoletas > getAsientosDisponibles()) {
            System.out.println("ERROR: solo quedan " + getAsientosDisponibles() + " asientos disponibles.");
        } else {
            setAsientosOcupados(getAsientosOcupados() + cantidadBoletas);
            System.out.println("Venta exitosa! Se han vendido " + cantidadBoletas
                    + " entradas para la funcion normal.");
        }
    }
}