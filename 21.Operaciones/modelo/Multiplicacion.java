package modelo;

public class Multiplicacion extends Operacion // Multiplicacion hereda de Operacion
{
    // Constructor
    public Multiplicacion(double x, double y)
    {
        super(x, y); // Llama al constructor de la clase padre
    }

    // Métodos
    public void multiplicar()
    {
        resultado = x * y;
    }
}
