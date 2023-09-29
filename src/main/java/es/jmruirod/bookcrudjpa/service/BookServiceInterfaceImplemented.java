package es.jmruirod.bookcrudjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmruirod.bookcrudjpa.dao.BookDao;
import es.jmruirod.bookcrudjpa.model.Book;

/**
 * Implementación de la interfaz {@link BookServiceInterface} que proporciona servicios para la gestión de libros.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@Service
public class BookServiceInterfaceImplemented implements BookServiceInterface
{

    @Autowired
    private BookDao bookDao;

    /**
     * Obtiene una lista de todos los libros.
     * 
     * @return Lista de libros.
     */
    @Override
    public List<Book> getAll() 
    {
        return this.bookDao.findAll();        
    }

    /**
     * Encuentra un libro por su ISBN.
     * 
     * @param isbn El ISBN del libro a buscar.
     * @return El libro encontrado o null si no se encuentra.
     */
    @Override
    public Book findById(int isbn) 
    {
        return this.bookDao.findById(isbn).orElse(null);
    }

    /**
     * Crea un nuevo libro y lo agrega.
     * 
     * @param book El libro a crear y agregar.
     * @return Lista de libros actualizada.
     */
    @Override
    public List<Book> create(Book book) 
    {
        this.bookDao.save(book);
        return this.bookDao.findAll();
    }

    /**
     * Actualiza la información de un libro existente.
     * 
     * @param book El libro con la información actualizada.
     */
    @Override
    public void update(Book book) 
    {
        this.bookDao.save(book);
    }

    /**
     * Elimina un libro por su ISBN.
     * 
     * @param isbn El ISBN del libro a eliminar.
     * @return Lista de libros actualizada.
     */
    @Override
    public List<Book> delete(int isbn) 
    {
        this.bookDao.deleteById(isbn);
        return this.bookDao.findAll();
    }
}