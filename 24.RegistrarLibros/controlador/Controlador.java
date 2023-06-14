package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Biblioteca;
import modelo.Libro;
import modelo.LibroColeccion;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //
    // Atributos
    //

    private VentanaPrincipal venPrin;
    private Biblioteca biblioteca;
    
    //
    // Métodos
    //

    // Método constructor
    public Controlador(VentanaPrincipal pVenPrin, Biblioteca pBiblioteca)
    {
        this.venPrin = pVenPrin;
        this.biblioteca = pBiblioteca;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("Sistema de registro de libros\nBiblioteca del señor Perez\n\nRegistre un libro para comenzar\n\nSi el libro tiene varios autores\nutilice el formato:\nautor1, autor2 y autor3");
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String comando = ae.getActionCommand();

        if(comando.equals("registrar"))
        {
            String titulo = venPrin.miPanelEntradaDatos.getTitulo();
            String autor = venPrin.miPanelEntradaDatos.getAutor();
            String edicion = venPrin.miPanelEntradaDatos.getEdicion();
            Boolean lujo = venPrin.miPanelEntradaDatos.getEsLujo();
            
            if(titulo.equals("") || autor.equals("") || edicion.equals(""))
            {
                venPrin.miPanelResultados.mostrarResultado("Por favor, llene todos los campos");
            }
            else
            {
                if(venPrin.miPanelEntradaDatos.getEsColeccion())
                {
                    venPrin.crearDialogoRegistrarLibroColeccion();
                }
                else
                {
                    biblioteca.registrarLibro(new Libro(titulo, autor, edicion, lujo));
                    Libro libro = biblioteca.getLibro(0);
                    venPrin.miPanelResultados.mostrarResultado("Libro registrado exitosamente\n\n" + "Titulo: " + titulo + "\nAutor: " + libro.getAutores() + "\nEdición: " + edicion + "\nLujo: " + libro.getLujo());
                }
            } 
        }

        if(comando.equals("aceptarRegistro"))
        {
            String titulo = venPrin.miPanelEntradaDatos.getTitulo();
            String autor = venPrin.miPanelEntradaDatos.getAutor();
            String edicion = venPrin.miPanelEntradaDatos.getEdicion();
            Boolean lujo = venPrin.miPanelEntradaDatos.getEsLujo();
            String nombreColeccion = venPrin.miDialogoRegistrarLibro.getNombreColeccion();
            int numeroColeccion = venPrin.miDialogoRegistrarLibro.getNumeroColeccion();

            if(nombreColeccion.equals("") || numeroColeccion == 0)
            {
                venPrin.miPanelResultados.mostrarResultado("Por favor, llene todos los campos");
                venPrin.miDialogoRegistrarLibro.cerrarDialogoRegistrar();
            }
            else
            {
                biblioteca.registrarLibroColeccion(new LibroColeccion(titulo, autor, edicion, lujo, nombreColeccion, numeroColeccion));
                LibroColeccion libroColeccion = biblioteca.getLibroColeccion(0);
            }
        }

        if(comando.equals("cancelarRegistro"))
        {
            venPrin.miDialogoRegistrarLibro.cerrarDialogoRegistrar();
        }

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
    
}