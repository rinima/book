package com.daomain;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
	private static List<Book> books;
	private String author;
	private String type;
	public BookShelf(){
		
	}
	
	public BookShelf(String author, String type) {
		super();
		this.author = author;
		this.type = type;
		books=new ArrayList<Book>();
	}

	public void addBook(Book book){
		if(validate(book)){
			books.add(book);
		}
		
	}
	public List<Book> getBooks(){
		return books;
	}
	private boolean validate(Book book){
		AuthorSpecification as=new AuthorSpecification(author);
		TypeSpecification ts =new TypeSpecification(type);
		return (as.isSatisfiedBy(book)&&ts.isSatisfiedBy(book));
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
