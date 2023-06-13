package modelo;

public class FechaDetallada extends Fecha
{
    //
    // Atributos
    //

    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio","julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    // Método constructor
    public FechaDetallada()
    {
        super();
    }

    public FechaDetallada(String fecha)
    {
        super(fecha);
    }

    public FechaDetallada(int pdia, int pmes, int panio)
    {
        super(pdia, pmes, panio);
    }

    // Métodos
    public String toString()
    {
        return getDia() + " de " + meses[getMes() - 1] + " de " + getAnio();
    }
}
