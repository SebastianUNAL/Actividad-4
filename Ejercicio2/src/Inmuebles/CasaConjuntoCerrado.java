package Inmuebles;

public class CasaConjuntoCerrado extends Casa {
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;
    
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos, int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administracion =" + valorAdministracion);
        System.out.println("Tiene Piscina? =" + tienePiscina);
        System.out.println("Tiene Campos Deportivos? =" + tieneCamposDeportivos);
    }

}
