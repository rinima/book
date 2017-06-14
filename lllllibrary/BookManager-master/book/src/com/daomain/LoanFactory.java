package com.daomain;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class LoanFactory {
	
	public LoanFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan CreateLoan(Book book,Member member){
		Loan loan = new Loan();
		book.setLoanTo(member);
		loan.setBook(book);
		loan.setMember(member);
		loan.setId("1");
		LocalDateTime time=LocalDateTime.now();
		loan.setLoanDate(time);
		loan.setReturnDate(time.plusDays(20));
		return loan;
	}
}
