package com.daomain;

import java.util.ArrayList;

public class Member {
	private String Id;
	private String Name;
	private ArrayList<Loan> Loans;
	public Member(String id, String name, ArrayList<Loan> loans) {
		super();
		Id = id;
		Name = name;
		Loans = loans;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void Return(Book book){
		Loan loan=FindCurrentLoanFor(book);
		loan.MarkAsReturned();
		loan.getBook().setLoanTo(null);
		Loans.remove(loan);
	}
	public boolean CanLoan(Book book){
		if(book.getLoanTo()==null){
			return true;
		}
		return false;
	}
	public Loan Loan(Book book){
		Loan loan = new Loan();
		if(CanLoan(book)){
			LoanFactory loanFactory =new LoanFactory();
			loan=loanFactory.CreateLoan(book, this);			
			Loans.add(loan);
		}
		return loan;
		
	}
	public Loan FindCurrentLoanFor(Book book){
		for(int i=0;i<Loans.size();i++){
			if(book.getId().equals(Loans.get(i).getBook().getId())){
				return Loans.get(i);
			}
		}
		return null;
		
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Loan> getLoans() {
		return Loans;
	}
	public void setLoans(ArrayList<Loan> loans) {
		Loans = loans;
	}
	
}
