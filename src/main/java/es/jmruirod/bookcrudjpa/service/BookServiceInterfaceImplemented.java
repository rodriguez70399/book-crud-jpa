package es.jmruirod.bookcrudjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmruirod.bookcrudjpa.dao.BookDao;
import es.jmruirod.bookcrudjpa.model.Book;

@Service
public class BookServiceInterfaceImplemented implements BookServiceInterface
{

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAll() 
    {
        return this.bookDao.findAll();        
    }

    @Override
    public Book findById(int isbn) 
    {
        return this.bookDao.findById(isbn).orElse(null);
    }

    @Override
    public List<Book> create(Book book) 
    {
        this.bookDao.save(book);
        return this.bookDao.findAll();
    }

    @Override
    public void update(Book book) 
    {
        this.bookDao.save(book);
    }

    @Override
    public List<Book> delete(int isbn) 
    {
        this.bookDao.deleteById(isbn);
        return this.bookDao.findAll();
    }
}
