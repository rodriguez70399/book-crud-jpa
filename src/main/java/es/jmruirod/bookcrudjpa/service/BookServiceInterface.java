package es.jmruirod.bookcrudjpa.service;

import java.util.List;

import es.jmruirod.bookcrudjpa.model.Book;

public interface BookServiceInterface 
{
    public List<Book> getAll();
    public Book findById(int isbn);
    public List<Book> create(Book book);
    public void update(Book book);
    public List<Book> delete(int isbn);    
}
