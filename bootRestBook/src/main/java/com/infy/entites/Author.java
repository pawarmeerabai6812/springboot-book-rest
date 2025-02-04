package com.infy.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorId;
	
	@Column(name="first_name")
	private String firstName;
	
	
	private String lastName;
	private String language;
	public int getAuthorId() {
		return authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getLanguage() {
		return language;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
	
	
	
	

}
