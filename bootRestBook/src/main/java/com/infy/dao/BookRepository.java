package com.infy.dao;

import org.springframework.data.repository.CrudRepository;

import com.infy.entites.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	public Book findById(int id);

}
