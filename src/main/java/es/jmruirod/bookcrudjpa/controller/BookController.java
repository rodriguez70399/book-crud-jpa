package es.jmruirod.bookcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import es.jmruirod.bookcrudjpa.model.Book;
import es.jmruirod.bookcrudjpa.service.BookServiceInterface;

/**
 * Controlador que gestiona las solicitudes relacionadas con libros.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@RestController
public class BookController 
{
    @Autowired
    private BookServiceInterface service;

    /**
     * Obtiene una lista de todos los libros.
     * 
     * @return Lista de libros en formato JSON.
     * @apiNote GET: localhost:PUERTO/books
     */
    @GetMapping(value = "books", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAll()
    {
        return this.service.getAll();
    }

    /**
     * Busca un libro por su ISBN.
     * 
     * @param isbn El ISBN del libro a buscar.
     * @return El libro encontrado en formato JSON o null si no se encuentra.
     * @apiNote GET: localhost:PUERTO/book/{isbn}
     */
    @GetMapping(value = "book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book findById(@PathVariable("isbn") int isbn)
    {
        return this.service.findById(isbn);
    }

    /**
     * Crea un nuevo libro y lo agrega.
     * 
     * @param book El libro a crear y agregar en formato JSON.
     * @return Lista de libros actualizada en formato JSON.
     * @apiNote POST: localhost:PUERTO/book
     */
    @PostMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> create(@RequestBody Book book) 
    {
        return this.service.create(book);        
    }

    /**
     * Actualiza la información de un libro existente.
     * 
     * @param book El libro con la información actualizada en formato JSON.
     * @apiNote PUT: localhost:PUERTO/book
     */
    @PutMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Book book) 
    {
        this.service.update(book);
    }

    /**
     * Elimina un libro por su ISBN.
     * 
     * @param isbn El ISBN del libro a eliminar.
     * @return Lista de libros actualizada en formato JSON.
     * @apiNote DELETE: localhost:PUERTO/book/{isbn}
     */
    @DeleteMapping(value = "book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> delete(@PathVariable("isbn") int isbn) 
    {
        return this.service.delete(isbn);
    }
}