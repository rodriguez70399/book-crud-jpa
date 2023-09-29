package es.jmruirod.bookcrudjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jmruirod.bookcrudjpa.model.Book;

public interface BookDao extends JpaRepository<Book, Integer>
{
    
}
