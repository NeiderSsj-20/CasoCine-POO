
package CasoCine;

public class FuncionEstreno extends FuncionCine {

    // ATRIBUTO PROPIO
    private double recargoEstreno;

    // CONSTRUCTOR PARAMETRIZADO
    public FuncionEstreno(String tituloPelicula, String sala, int asientosOcupados,double recaudacion, double recargoEstreno) {
        super(tituloPelicula, sala, asientosOcupados, recaudacion);
        this.recargoEstreno = recargoEstreno;
        calcularRecaudacion(); 
    }

    // Modifica el calculo del padre: ahora incluye el recargo de estreno
    @Override
    public void calcularRecaudacion() {
        setRecaudacion(getAsientosOcupados() * (TARIFA_BASE + recargoEstreno));
    }

    // GET Y SET DEL RECARGO
    public double getRecargoEstreno() {
        return recargoEstreno;
    }

    public void setRecargoEstreno(double recargoEstreno) {
        if (recargoEstreno >= 0) {
            this.recargoEstreno = recargoEstreno;
            calcularRecaudacion();
        } else {
            System.out.println("ERROR: el recargo de estreno no puede ser negativo.");
        }
    }

    // MOSTRAR INFORMACION
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RECARGO ESTRENO: $" + recargoEstreno + " COP");
    }
}