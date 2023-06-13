package ejecutable;

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test
{
    public static void main(String[] args)
    {
        // Método principal
        
        //
        // Prueba del círculo
        //

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Radio del círculo: "));

        // Creación del Circulo
        Circulo miCirculo = new Circulo(radio);
        miCirculo.calcularAreaPerimetro();

        JOptionPane.showMessageDialog(null, "Área: " + miCirculo.getArea() + "\nPerímetro " + miCirculo.getPerimetro());

        //
        // Prueba del Rectángulo
        //

        double base = Double.parseDouble(JOptionPane.showInputDialog("Base del rectángulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura del rectángulo: "));

        // Creación del Rectángulo
        Rectangulo miRectangulo = new Rectangulo(base, altura);
        miRectangulo.calcularAreaPerimetro();

        JOptionPane.showMessageDialog(null, "Área: " + miRectangulo.getArea() + "\nPerímetro " + miRectangulo.getPerimetro());
    }
}