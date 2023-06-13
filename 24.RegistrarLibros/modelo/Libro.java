package modelo;

public class Libro 
{
    //
    // Atributos
    //

    protected String titulo;
    protected String autor;
    protected String edicion;
    protected Boolean lujo;

    //
    // Métodos
    //

    // Constructor
    public Libro(String pTitulo, String pAutor, String pEdicion, Boolean pLujo)
    {
        this.titulo = pTitulo;
        this.autor = pAutor;
        this.edicion = pEdicion;
        this.lujo = pLujo;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getAutores()
    {
        boolean masDeDosAutores = autor.contains(",");

        if(masDeDosAutores)
        {
            String[] autores = autor.split(",");
            return autores[0] + "," + autores[1] + " y otros";
        }
        else
        {
            return autor;
        }
    }

    public String getEdicion()
    {
        return edicion;
    }

    public String getLujo()
    {
        if(lujo)
        {
            return "Sí";
        }
        else
        {
            return "No";
        }
    }
}
