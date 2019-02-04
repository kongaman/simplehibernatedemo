package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Book book = new Book();
		book.setBookName("Der weisse Hai");
		book.setBookAuthor("Peter Benchley");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(book);
		tx.commit();
		session.close();
		sessionFactory.close();
		
		System.out.println(book.toString());
		System.out.println("Book record saved succesfully");
	}

}
