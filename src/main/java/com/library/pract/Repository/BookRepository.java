package com.library.pract.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.pract.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
	
	List<Book> findAll();
}
