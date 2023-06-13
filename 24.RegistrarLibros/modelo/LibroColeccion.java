package modelo;

public class LibroColeccion extends Libro
{
    //
    // Atributos
    //

    private String nombreColeccion;
    private int numeroColeccion;

    //
    // Métodos
    //

    // Constructor
    public LibroColeccion(String pTitulo, String pAutor, String pEdicion, Boolean pLujo, String pNombreColeccion, int pNumeroColeccion)
    {
        super(pTitulo, pAutor, pEdicion, pLujo);
        this.nombreColeccion = pNombreColeccion;
        this.numeroColeccion = pNumeroColeccion;
    }

    public String getNombreColeccion()
    {
        return nombreColeccion;
    }

    public int getNumeroColeccion()
    {
        return numeroColeccion;
    }
}
