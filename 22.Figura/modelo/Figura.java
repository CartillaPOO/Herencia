package modelo;

public class Figura
{
    //
    // Atributos
    //

    protected double area;
    protected double perimetro;
    
    // Constructor
    public Figura()
    {
        this.perimetro = 0;
        this.area = 0;
    }

    public double getArea()
    {
        return this.area;
    }

    public double getPerimetro()
    {
        return this.perimetro;
    }
}
