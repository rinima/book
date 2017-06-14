package com.daomain;

public class Book {
	private String Id;
	private String ISBN;
	private String Title;
	private Member LoanTo;
	private String Author;
	private String Type;
	public Book() {
		super();
	}


	public Book(String id, String iSBN, String title, Member loanTo, String author, String type) {
		super();
		Id = id;
		ISBN = iSBN;
		Title = title;
		LoanTo = loanTo;
		Author = author;
		Type = type;
	}


	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Member getLoanTo() {
		return LoanTo;
	}

	public void setLoanTo(Member loanTo) {
		LoanTo = loanTo;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}
	
}
