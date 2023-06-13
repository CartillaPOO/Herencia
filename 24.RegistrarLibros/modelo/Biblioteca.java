package modelo;

import java.util.ArrayList;

public class Biblioteca
{
    //
    // Atributos
    //

    // Atributos para libros normales
    private ArrayList<Libro> libros;

    // Atributos para libros de colección
    private ArrayList<LibroColeccion> librosColeccion;
    private ArrayList<String> nombresColeccion; // Nombres de colección de los libros registrados
    private ArrayList<ArrayList<LibroColeccion>> gruposColeccion; // Grupos de libros con el mismo nombre de colección

    //
    // Métodos
    //

    public Biblioteca()
    {
        libros = new ArrayList<>();
        librosColeccion = new ArrayList<>();
    }

    public void registrarLibro(Libro pLibro)
    {
        libros.add(0, pLibro); // Agrega el libro al principio de la lista
    }

    public void registrarLibroColeccion(LibroColeccion pLibroColeccion)
    {
        librosColeccion.add(pLibroColeccion);

        if(nombresColeccion.contains(pLibroColeccion.getNombreColeccion()))
        {
            int indice = nombresColeccion.indexOf(pLibroColeccion.getNombreColeccion()); // Ejemplo: Si el nombre de colección es "Harry Potter", el índice será 0, ya que es el primer elemento de la lista
            gruposColeccion.get(indice).add(pLibroColeccion); // Agrega el libro al grupo de libros con el mismo nombre de colección
        }
        else
        {
            nombresColeccion.add(pLibroColeccion.getNombreColeccion());
        }
    }

    public Libro getLibro(int pIndice)
    {
        return libros.get(pIndice);
    }
}
