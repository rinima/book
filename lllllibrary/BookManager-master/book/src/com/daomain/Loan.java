package com.daomain;

import java.time.LocalDateTime;

public class Loan {
	private String Id;
	private LocalDateTime LoanDate;
	private LocalDateTime DateForReturn;
	private LocalDateTime ReturnDate;
	private Book Book;
	private Member member;
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Loan(String id, LocalDateTime loanDate, LocalDateTime dateForReturn, LocalDateTime returnDate,
			com.daomain.Book book, Member member) {
		super();
		Id = id;
		LoanDate = loanDate;
		DateForReturn = dateForReturn;
		ReturnDate = returnDate;
		Book = book;
		this.member = member;
	}

	public boolean HasNotBeenReturned(){
		return false;
		
	}
	public void MarkAsReturned(){
		this.setMember(null);
		LocalDateTime d=LocalDateTime.now();
		this.setReturnDate(d);
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		Book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}

	public LocalDateTime getLoanDate() {
		return LoanDate;
	}

	public void setLoanDate(LocalDateTime loanDate) {
		LoanDate = loanDate;
	}

	public LocalDateTime getDateForReturn() {
		return DateForReturn;
	}

	public void setDateForReturn(LocalDateTime dateForReturn) {
		DateForReturn = dateForReturn;
	}

	public LocalDateTime getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		ReturnDate = returnDate;
	}
	
}
