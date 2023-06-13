package modelo;

public class Circulo extends Figura
{
    //
    // Atributos
    //

    private double radio;

    // Método constructor
    public Circulo(double pradio)
    {
        this.radio = pradio;
    }

    // Métodos
    public void calcularAreaPerimetro()
    {
        this.area = Math.PI * Math.pow(radio, 2);
        this.perimetro = 2 * Math.PI * radio;
    }
}