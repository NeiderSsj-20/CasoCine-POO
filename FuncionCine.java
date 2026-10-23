package CasoCine;
public class FuncionCine {

    protected static final double TARIFA_BASE = 12000.0;

    // ATRIBUTOS PRIVADOS
    private String tituloPelicula;
    private String sala;
    private int asientosOcupados;
    private double recaudacion;

    // CONSTRUCTOR PARAMETRIZADO
    public FuncionCine(String tituloPelicula, String sala, int asientosOcupados, double recaudacion) {
        this.tituloPelicula = tituloPelicula;
        this.sala = sala;
        this.asientosOcupados = asientosOcupados;
        this.recaudacion = recaudacion;
    }

    // METODOS GET
    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public String getSala() {
        return sala;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    // METODOS SET
    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    // Validacion: los asientos no pueden ser negativos
    public void setAsientosOcupados(int asientosOcupados) {
        if (asientosOcupados >= 0) {
            this.asientosOcupados = asientosOcupados;
            calcularRecaudacion();
        } else {
            System.out.println("ERROR: la cantidad de asientos no puede ser negativa.");
        }
    }

    // Validacion: la recaudacion no puede ser negativa
    public void setRecaudacion(double recaudacion) {
        if (recaudacion >= 0) {
            this.recaudacion = recaudacion;
        } else {
            System.out.println("ERROR: la recaudacion no puede ser negativa.");
        }
    }

    // Calculo base: asientosOcupados * 12000
    public void calcularRecaudacion() {
        this.recaudacion = this.asientosOcupados * TARIFA_BASE;
    }

    // MOSTRAR INFORMACION
    public void mostrar() {
        System.out.println("PELICULA: " + tituloPelicula);
        System.out.println("SALA: " + sala);
        System.out.println("ASIENTOS OCUPADOS: " + asientosOcupados);
        System.out.println("RECAUDACION: $" + recaudacion + " COP");
    }
}
