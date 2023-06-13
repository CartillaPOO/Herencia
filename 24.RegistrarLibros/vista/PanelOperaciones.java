package vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelOperaciones extends JPanel
{
    //
    // Atributos
    //

    public JButton btRegistrar;
    public JButton btConsultarLibros;
    public JButton btConsultarColecciones;
    public JButton btSalir;

    //
    // Métodos
    //

    // Constructor
    public PanelOperaciones()
    {
        this.setLayout(null);
        this.setBackground(new Color(31,31,31));

        // Creación y adición de os botones
        btRegistrar = new JButton("Registrar");
        btRegistrar.setBackground(new Color(59,59,59));
        btRegistrar.setForeground(Color.WHITE);
        btRegistrar.setActionCommand("registrar");
        btRegistrar.setBounds(20,30,100,40);
        this.add(btRegistrar);
        
        // Para que el texto de los botones haga un salto de línea y se vea centrado, se usa HTML
        btConsultarLibros = new JButton("<html><center>Consultar<br>Libros</center></html>");
        btConsultarLibros.setBackground(new Color(59,59,59));
        btConsultarLibros.setForeground(Color.WHITE);
        btConsultarLibros.setActionCommand("consultarLibros");
        btConsultarLibros.setBounds(160,30,100,40);
        btConsultarLibros.setEnabled(false);
        this.add(btConsultarLibros);

        btConsultarColecciones = new JButton("<html><center>Consultar<br>Colecciones</center></html>");
        btConsultarColecciones.setBackground(new Color(59,59,59));
        btConsultarColecciones.setForeground(Color.WHITE);
        btConsultarColecciones.setActionCommand("consultarColecciones");
        btConsultarColecciones.setBounds(300,30,100,40);
        btConsultarColecciones.setEnabled(false);
        this.add(btConsultarColecciones);

        btSalir = new JButton("Salir");
        btSalir.setBackground(new Color(59,59,59));
        btSalir.setForeground(Color.WHITE);
        btSalir.setBounds(440,30,100,40);
        btSalir.setActionCommand("salir");
        this.add(btSalir);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btRegistrar.addActionListener(pAL);
        btConsultarLibros.addActionListener(pAL);
        btConsultarColecciones.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }

    public void activarBotones()
    {
        btConsultarLibros.setEnabled(true);
        btConsultarColecciones.setEnabled(true);
    }
}
