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

        if(nombresColeccion.contains(pLibroColeccion.getNombreColeccion())) // Si el nombre de colección ya está registrado
        {
            int indice = nombresColeccion.indexOf(pLibroColeccion.getNombreColeccion()); // Ejemplo: Si el nombre de colección es "Harry Potter", el índice será 0, ya que es el primer elemento de la lista
            gruposColeccion.get(indice).add(pLibroColeccion); // Obtiene el grupo de libros con el mismo nombre de colección y agrega el libro a ese grupo
        }
        else
        {
            nombresColeccion.add(pLibroColeccion.getNombreColeccion()); // Agrega el nombre de colección a la lista de nombres de colección
            ArrayList<LibroColeccion> grupo = new ArrayList<>(); // Crea un nuevo grupo de libros con el mismo nombre de colección
            grupo.add(pLibroColeccion); // Agrega el libro al grupo
            gruposColeccion.add(grupo); // Agrega el grupo a la lista de grupos
        }
    }

    public void ordenarGrupoColeccion()
    {
        // Ordena los grupos de libros con el mismo nombre de colección por número de colección (de menor a mayor)
        for(int i = 0; i < gruposColeccion.size(); i++) // Recorre todos los grupos de libros con el mismo nombre de colección
        {
            for(int j = 0; j < gruposColeccion.get(i).size(); j++) // Recorre todos los libros del grupo
            {
                for(int k = 0; k < gruposColeccion.get(i).size() - 1; k++) // Recorre todos los libros del grupo excepto el último (ya que no habría nada con qué compararlo)
                {
                    if(gruposColeccion.get(i).get(k).getNumeroColeccion() > gruposColeccion.get(i).get(k + 1).getNumeroColeccion()) // Si el número de colección del libro actual es mayor al del siguiente libro
                    {
                        LibroColeccion temp = gruposColeccion.get(i).get(k);
                        gruposColeccion.get(i).set(k, gruposColeccion.get(i).get(k + 1));
                        gruposColeccion.get(i).set(k + 1, temp);
                    }
                }
            }
        }
    }

    public Libro getLibro(int pIndice)
    {
        return libros.get(pIndice);
    }

    public LibroColeccion getLibroColeccion(int pIndice)
    {
        return librosColeccion.get(pIndice);
    }
}
