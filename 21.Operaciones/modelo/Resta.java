package modelo;

public class Resta extends Operacion // Resta hereda de Operacion
{
    // Constructor
    public Resta(double x, double y)
    {
        super(x, y); // Llama al constructor de la clase padre
    }

    // Métodos
    public void restar()
    {
        resultado = x - y;
    }
}