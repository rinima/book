package com.daomain;

public class TypeSpecification implements Specification<Book> {
	private String Type;
	
	public TypeSpecification(String type) {
		super();
		Type = type;
	}

	public boolean isSatisfiedBy(Book book){
		return (book.getType().equals(Type));
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
}
