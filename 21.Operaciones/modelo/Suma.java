package modelo;

public class Suma extends Operacion // Suma hereda de Operacion
{
    // Constructor
    public Suma(double x, double y)
    {
        super(x, y); // Llama al constructor de la clase padre
    }

    // Métodos
    public void sumar()
    {
        resultado = x + y;
    }
}