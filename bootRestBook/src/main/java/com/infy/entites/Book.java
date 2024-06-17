package com.infy.entites;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class Book {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="book_id")	
	private int id;
	private String title;
	//this variable is a author type we need to declare class.
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
	
	
	public Book(int id, String title, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
		
	}
	
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
	
	

}
