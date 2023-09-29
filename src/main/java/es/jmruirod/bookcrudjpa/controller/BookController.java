package es.jmruirod.bookcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.bookcrudjpa.model.Book;
import es.jmruirod.bookcrudjpa.service.BookServiceInterface;

@RestController
public class BookController 
{
    @Autowired
    private BookServiceInterface service;

    @GetMapping(value = "books", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAll()
    {
        return this.service.getAll();
    }

    @GetMapping(value = "book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book findById(@PathVariable("isbn") int isbn)
    {
        return this.service.findById(isbn);
    }

    @PostMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> create(@RequestBody Book book) 
    {
        return this.service.create(book);        
    }

    @PutMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Book book) 
    {
        this.service.update(book);
    }

    @DeleteMapping(value = "book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> delete(@PathVariable("isbn") int isbn) 
    {
        return this.service.delete(isbn);
    }
}