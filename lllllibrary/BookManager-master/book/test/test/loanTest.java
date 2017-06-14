package test;

import java.util.ArrayList;

import com.daomain.Book;
import com.daomain.BookShelf;
import com.daomain.Loan;
import com.daomain.Member;

public class loanTest {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Book book1=new Book("1","tp312-1","java基础",null,"闫士佳","计算机");
		Book book2=new Book("2","tp312-2","java从入门到精通",null,"闫士佳","计算机");
		Book book3=new Book("3","tp312-3","java从入门到放弃",null,"闫士佳","计算机");
		BookShelf shelf=new BookShelf("闫士佳","计算机");
		shelf.addBook(book1);
		shelf.addBook(book2);
		shelf.addBook(book3);
		Member member=new Member("1","闫士佳",new ArrayList<Loan>());
		Book book = shelf.getBooks().get(0);
		Loan loan=member.Loan(book);
		System.out.println("借书成功，时间为"+loan.getLoanDate());
		Thread.sleep(5000);
		member.Return(book);
		System.out.println("还书成功，时间为"+loan.getReturnDate());
	}

}
