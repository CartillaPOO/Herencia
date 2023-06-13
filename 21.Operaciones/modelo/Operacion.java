package modelo;

public class Operacion 
{
    //
    // Atributos
    //

    protected double x; // protected: sólo las clases hijas tienen acceso a estos atributos
    protected double y;
    protected double resultado;

    // Constructor
    public Operacion(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.resultado = 0;
    }

    // Métodos
    public double mostrarResultado() // Todas las clases hijas tienen acceso a este método
    {
        return this.resultado;
    }
}