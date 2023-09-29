package es.jmruirod.bookcrudjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jmruirod.bookcrudjpa.model.Book;

/**
 * Interfaz que define un Repositorio JPA para la entidad Book.
 * Extiende JpaRepository proporcionando operaciones CRUD estándar.
 * La entidad Book está identificada por un valor Integer (ISBN).
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface BookDao extends JpaRepository<Book, Integer>
{
    
}
