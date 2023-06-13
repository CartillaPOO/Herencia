package ejecutable;

import javax.swing.JOptionPane;

import modelo.Suma;
import modelo.Resta;
import modelo.Multiplicacion;
import modelo.Division;

public class Test
{
    // Método principal
    public static void main(String[] args)
    {
        // Entrada de datos
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y:"));

        // Creación de un objeto Suma
        Suma miSuma = new Suma(x, y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es " + miSuma.mostrarResultado());

        // Creación de un objeto Resta
        Resta miResta = new Resta(x, y);
        miResta.restar();
        JOptionPane.showMessageDialog(null, "La resta de " + x + " y " + y + " es " + miResta.mostrarResultado());

        // Creación de un objeto Multiplicacion
        Multiplicacion miMultiplicacion = new Multiplicacion(x, y);
        miMultiplicacion.multiplicar();
        JOptionPane.showMessageDialog(null, "La multiplicación de " + x + " y " + y + " es " + miMultiplicacion.mostrarResultado());

        // Creación de un objeto Division
        Division miDivision = new Division(x, y);
        miDivision.dividir();
        JOptionPane.showMessageDialog(null, "La división de " + x + " y " + y + " es " + miDivision.mostrarResultado());

        System.exit(0);
    }
}