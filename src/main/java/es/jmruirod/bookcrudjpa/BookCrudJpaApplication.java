package es.jmruirod.bookcrudjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal que inicia la aplicación Spring Boot para el CRUD de libros usando JPA.
 */
@SpringBootApplication
public class BookCrudJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCrudJpaApplication.class, args);
	}

}
