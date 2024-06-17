package com.infy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infy.dao.BookRepository;
import com.infy.entites.Book;



@Component
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	//get all books
	
	public List<Book> getAllBooks()
	{
		
	List<Book> list=(List<Book>)this.bookRepository.findAll();
	return list;
	}
	
	//get single book by id
	public Book getBookById(int id)
	{
		Book book=null;
		
		try {
		
			
			//book=list.stream().filter(e->e.getId()==id).findFirst().get();
		 book=this.bookRepository.findById(id);
			
		}catch(Exception e)
		
		{
			e.printStackTrace();
			
		}
		return book;
	}
	//adding the Book
	public Book addBook(Book b) {
		Book result=bookRepository.save(b);
		
		
		return result;
		
	}
	//deleting the book
	public void deleteBook(int bid)
	{
		
	//list=list.stream().filter(book->book.getId()!=bid)
	//.collect(Collectors.toList());
		bookRepository.deleteById(bid);
	
	}
	//update the book
	public void updateBook(Book book,int bookId) {
		book.setId(bookId);
		bookRepository.save(book);
		
		
	}
	
	
	
}
