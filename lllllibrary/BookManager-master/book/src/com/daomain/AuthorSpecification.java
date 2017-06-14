package com.daomain;

public class AuthorSpecification implements Specification<Book> {
	private String author;
	public AuthorSpecification(String author){
		this.author= author;
	}
	public boolean isSatisfiedBy(Book book){
		return (book.getAuthor().equals(author));
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
