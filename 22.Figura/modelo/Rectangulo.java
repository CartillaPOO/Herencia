package modelo;

public class Rectangulo extends Figura
{
    //
    // Atributos
    //

    private double base;
    private double altura;

    // Método constructor
    public Rectangulo(double pbase, double paltura)
    {
        this.base = pbase;
        this.altura = paltura;
    }

    // Métodos
    public void calcularAreaPerimetro()
    {
        this.area = base * altura;
        this.perimetro = 2*base + 2*altura;
    }
}