package es.jmruirod.bookcrudjpa.service;

import java.util.List;

import es.jmruirod.bookcrudjpa.model.Book;

/**
 * Interfaz que define los métodos de servicio para la gestión de libros.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface BookServiceInterface 
{
    /**
     * Obtiene una lista de todos los libros.
     * 
     * @return Lista de libros.
     */
    public List<Book> getAll();

    /**
     * Encuentra un libro por su ISBN.
     * 
     * @param isbn El ISBN del libro a buscar.
     * @return El libro encontrado o null si no se encuentra.
     */
    public Book findById(int isbn);

    /**
     * Crea un nuevo libro y lo agrega.
     * 
     * @param book El libro a crear y agregar.
     * @return Lista de libros actualizada.
     */
    public List<Book> create(Book book);

    /**
     * Actualiza la información de un libro existente.
     * 
     * @param book El libro con la información actualizada.
     */
    public void update(Book book);

    /**
     * Elimina un libro por su ISBN.
     * 
     * @param isbn El ISBN del libro a eliminar.
     * @return Lista de libros actualizada.
     */
    public List<Book> delete(int isbn);    
}
