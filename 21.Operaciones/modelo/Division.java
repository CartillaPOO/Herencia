package modelo;

public class Division extends Operacion // Division hereda de Operacion
{
    // Constructor
    public Division(double x, double y)
    {
        super(x, y); // Llama al constructor de la clase padre
    }

    // Métodos
    public void dividir()
    {
        resultado = x / y;
    }
}