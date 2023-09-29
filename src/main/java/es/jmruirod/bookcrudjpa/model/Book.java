package es.jmruirod.bookcrudjpa.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Esta clase representa un libro en la base de datos.
 *  
 * @Author Jose Manuel Ruiz Rodriguez
 */
@Entity
public class Book 
{
    @Id
    private int isbn;
    private String title;
    private String genre;
    
    /**
     * Constructor por defecto de la clase Book.
     */
    public Book() 
    {

    }

    /**
     * Constructor de la clase Book.
     * 
     * @param isbn   El ISBN del libro.
     * @param title  El título del libro.
     * @param genre  El género del libro.
     */
    public Book(int isbn, String title, String genre) 
    {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
    }

    /**
     * Obtiene el ISBN del libro.
     * 
     * @return El ISBN del libro.
     */
    public int getIsbn() 
    {
        return isbn;
    }

    /**
     * Establece el ISBN del libro.
     * 
     * @param isbn El ISBN del libro.
     */
    public void setIsbn(int isbn) 
    {
        this.isbn = isbn;
    }

    /**
     * Obtiene el título del libro.
     * 
     * @return El título del libro.
     */
    public String getTitle() 
    {
        return title;
    }

    /**
     * Establece el título del libro.
     * 
     * @param title El título del libro.
     */
    public void setTitle(String title) 
    {
        this.title = title;
    }

    /**
     * Obtiene el género del libro.
     * 
     * @return El género del libro.
     */
    public String getGenre() 
    {
        return genre;
    }

    /**
     * Establece el género del libro.
     * 
     * @param genre El género del libro.
     */
    public void setGenre(String genre) 
    {
        this.genre = genre;
    }

    /**
     * Sobrescribe el método toString para representar el objeto Book como una cadena.
     */
    @Override
    public String toString() 
    {
        return "Book [isbn=" + isbn + ", title=" + title + ", genre=" + genre + "]";
    }

    /**
     * Calcula el hash code del objeto Book basado en el ISBN.
     */
    @Override
    public int hashCode() 
    {
        return Objects.hashCode(isbn);
    }

    /**
     * Compara dos objetos Book para determinar si son iguales.
     * Dos libros son iguales si tienen el mismo ISBN, título y género.
     */
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Book other = (Book) obj;

        if (isbn != other.isbn)
            return false;

        if (title == null) 
        {
            if (other.title != null)
                return false;
        } 
        else if (!title.equals(other.title))
            return false;

        if (genre == null) 
        {
            if (other.genre != null)
                return false;
        }
        else if (!genre.equals(other.genre))
            return false;

        return true;
    }
}
