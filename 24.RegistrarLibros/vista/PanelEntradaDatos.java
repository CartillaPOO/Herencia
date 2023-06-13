package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class PanelEntradaDatos extends JPanel
{
    //
    // Atributos
    //

    private JRadioButton rbSiColeccion;
    private JRadioButton rbNoColeccion;
    private ButtonGroup bgColeccion;
    private JRadioButton rbSiLujo;
    private JRadioButton rbNoLujo;
    private ButtonGroup bgLujo;
    private JLabel lbTitulo;
    private JLabel lbAutor;
    private JLabel lbEdicion;
    private JLabel lbColeccion;
    private JLabel lbLujo;
    private JTextField tfTitulo;
    private JTextField tfAutor;
    private JTextField tfEdicion;
    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //

    // Método constructor
    public PanelEntradaDatos()
    {
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        lbTitulo = new JLabel("Título:", JLabel.RIGHT);
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setBounds(0,10,120,20);
        this.add(lbTitulo);

        lbAutor = new JLabel("Autor(es):", JLabel.RIGHT);
        lbAutor.setFont(fontLabel);
        lbAutor.setForeground(Color.WHITE);
        lbAutor.setBounds(0,40,120,20);
        this.add(lbAutor);

        lbEdicion = new JLabel("Edición:", JLabel.RIGHT);
        lbEdicion.setFont(fontLabel);
        lbEdicion.setForeground(Color.WHITE);
        lbEdicion.setBounds(0,70,170,20);
        this.add(lbEdicion);

        lbColeccion = new JLabel("¿Es un libro de colección?", JLabel.CENTER);
        lbColeccion.setFont(fontLabel);
        lbColeccion.setForeground(Color.WHITE);
        lbColeccion.setBounds(0,105,340,20);
        this.add(lbColeccion);

        rbSiColeccion = new JRadioButton("Sí");
        rbSiColeccion.setBackground(new Color(31,31,31));
        rbSiColeccion.setFont(fontField);
        rbSiColeccion.setForeground(Color.WHITE);
        rbSiColeccion.setBounds(100,135,50,20);
        this.add(rbSiColeccion);

        rbNoColeccion = new JRadioButton("No");
        rbNoColeccion.setBackground(new Color(31,31,31));
        rbNoColeccion.setFont(fontField);
        rbNoColeccion.setForeground(Color.WHITE);
        rbNoColeccion.setSelected(true);
        rbNoColeccion.setBounds(200,135,50,20);
        this.add(rbNoColeccion);

        bgColeccion = new ButtonGroup();
        bgColeccion.add(rbSiColeccion);
        bgColeccion.add(rbNoColeccion);

        lbLujo = new JLabel("¿Es un libro de lujo?", JLabel.CENTER);
        lbLujo.setFont(fontLabel);
        lbLujo.setForeground(Color.WHITE);
        lbLujo.setBounds(0,165,340,20);
        this.add(lbLujo);

        rbSiLujo = new JRadioButton("Sí");
        rbSiLujo.setBackground(new Color(31,31,31));
        rbSiLujo.setFont(fontField);
        rbSiLujo.setForeground(Color.WHITE);
        rbSiLujo.setBounds(100,195,50,20);
        this.add(rbSiLujo);

        rbNoLujo = new JRadioButton("No");
        rbNoLujo.setBackground(new Color(31,31,31));
        rbNoLujo.setFont(fontField);
        rbNoLujo.setForeground(Color.WHITE);
        rbNoLujo.setSelected(true);
        rbNoLujo.setBounds(200,195,50,20);
        this.add(rbNoLujo);

        bgLujo = new ButtonGroup();
        bgLujo.add(rbSiLujo);
        bgLujo.add(rbNoLujo);

        tfTitulo = new JTextField();
        tfTitulo.setBackground(new Color(59,59,59));
        tfTitulo.setBorder(null);
        tfTitulo.setFont(fontField);
        tfTitulo.setForeground(Color.WHITE);
        tfTitulo.setCaretColor(Color.WHITE);
        tfTitulo.setBounds(130,10,170,20);
        this.add(tfTitulo);

        tfAutor = new JTextField();
        tfAutor.setBackground(new Color(59,59,59));
        tfAutor.setBorder(null);
        tfAutor.setFont(fontField);
        tfAutor.setForeground(Color.WHITE);
        tfAutor.setCaretColor(Color.WHITE);
        tfAutor.setBounds(130,40,170,20);
        this.add(tfAutor);

        tfEdicion = new JTextField();
        tfEdicion.setBackground(new Color(59,59,59));
        tfEdicion.setBorder(null);
        tfEdicion.setFont(fontField);
        tfEdicion.setForeground(Color.WHITE);
        tfEdicion.setCaretColor(Color.WHITE);
        tfEdicion.setBounds(180,70,40,20);
        this.add(tfEdicion);
    }

    // Métodos de acceso
    public String getTitulo()
    {
        return tfTitulo.getText();
    }

    public String getAutor()
    {
        return tfAutor.getText();
    }

    public String getEdicion()
    {
        return tfEdicion.getText();
    }

    public boolean getEsColeccion()
    {
        if(rbSiColeccion.isSelected())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean getEsLujo()
    {
        if(rbSiLujo.isSelected())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void borrarDatos()
    {
        tfTitulo.setText("");
        tfAutor.setText("");
        tfEdicion.setText("");
        rbNoColeccion.setSelected(true);
        rbNoLujo.setSelected(true);
    }
}
