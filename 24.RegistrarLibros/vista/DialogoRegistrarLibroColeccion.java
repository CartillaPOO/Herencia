package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogoRegistrarLibroColeccion extends JDialog
{
    //
    // Atributos
    //

    private JPanel colorFondo1;
    private JPanel colorFondo2;
    private JLabel lbTitulo; // Título del diálogo
    private JLabel lbNombreColeccion;
    private JLabel lbNumeroColeccion;
    private JTextField tfNombreColeccion;
    private JTextField tfNumeroColeccion;
    private JButton btAceptar;
    private JButton btCancelar;
    private Font fontLabel = new Font("Arial", Font.BOLD, 20);
    private Font fontField = new Font("Arial", Font.BOLD, 15);

    //
    // Métodos
    //

    // Constructor
    public DialogoRegistrarLibroColeccion()
    {
        // Definición del contenedor del diálogo
        this.setLayout(null);

        // Creación y adición de elementos
        lbTitulo = new JLabel("Datos de la colección", JLabel.CENTER);
        lbTitulo.setFont(fontLabel);
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setBounds(0,20,340,25);
        this.add(lbTitulo);

        lbNombreColeccion = new JLabel("Nombre:", JLabel.RIGHT);
        lbNombreColeccion.setFont(fontLabel);
        lbNombreColeccion.setForeground(Color.WHITE);
        lbNombreColeccion.setBounds(0,70,130,25);
        this.add(lbNombreColeccion);

        tfNombreColeccion = new JTextField();
        tfNombreColeccion.setBorder(null);
        tfNombreColeccion.setFont(fontField);
        tfNombreColeccion.setForeground(Color.WHITE);
        tfNombreColeccion.setCaretColor(Color.WHITE);
        tfNombreColeccion.setBackground(new Color(59,59,59));
        tfNombreColeccion.setBounds(140,70,140,25);
        this.add(tfNombreColeccion);

        lbNumeroColeccion = new JLabel("Número:", JLabel.RIGHT);
        lbNumeroColeccion.setFont(fontLabel);
        lbNumeroColeccion.setForeground(Color.WHITE);
        lbNumeroColeccion.setBounds(0,110,195,25);
        this.add(lbNumeroColeccion);

        tfNumeroColeccion = new JTextField();
        tfNumeroColeccion.setBorder(null);
        tfNumeroColeccion.setFont(fontField);
        tfNumeroColeccion.setForeground(Color.WHITE);
        tfNumeroColeccion.setCaretColor(Color.WHITE);
        tfNumeroColeccion.setBackground(new Color(59,59,59));
        tfNumeroColeccion.setBounds(200,110,20,25);
        this.add(tfNumeroColeccion);

        btAceptar = new JButton("Aceptar");
        btAceptar.setBackground(new Color(59,59,59));
        btAceptar.setForeground(Color.WHITE);
        btAceptar.setActionCommand("aceptarRegistro");
        btAceptar.setBounds(40,155,260,20);
        this.add(btAceptar);

        btCancelar = new JButton("Cancelar");
        btCancelar.setBackground(new Color(59,59,59));
        btCancelar.setForeground(Color.WHITE);
        btCancelar.setActionCommand("cancelarRegistro");
        btCancelar.setBounds(40,185,260,20);
        this.add(btCancelar);

        // Características de la ventana
        this.setUndecorated(true);
        this.setSize(340,230);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        colorFondo1 = new JPanel();
        colorFondo1.setBackground(new Color(31,31,31));
        colorFondo1.setBounds(10,10,320,210);
        this.add(colorFondo1);

        colorFondo2 = new JPanel();
        colorFondo2.setBackground(new Color(24,24,24));
        colorFondo2.setBounds(0,0,340,230);
        this.add(colorFondo2);
    }

    public String getNombreColeccion()
    {
        return tfNombreColeccion.getText();
    }

    public int getNumeroColeccion()
    {
        return Integer.parseInt(tfNumeroColeccion.getText());
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
        btCancelar.addActionListener(pAL);
    }

    public void cerrarDialogoRegistrar()
    {
        this.dispose();
    }
}
