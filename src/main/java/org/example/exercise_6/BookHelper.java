package org.example.exercise_6;


import org.example.exercise_6.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class BookHelper {

    private SessionFactory sessionFactory;

    public BookHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }


    public List<Book> getBookList() {
        Session session = sessionFactory.openSession();

        CriteriaQuery<Book> criteriaQuery = session.getCriteriaBuilder().createQuery(Book.class);
        criteriaQuery.from(Book.class);

        List<Book> bookList = session.createQuery(criteriaQuery).getResultList();
        session.close();

        return bookList;

    }

    public Book getBookById (long id) {
        Session session = sessionFactory.openSession();
        Book book = session.get(Book.class, id);
        return book;
    }

    public Book addBook (Book book) {
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        session.close();
        return book;
    }

    public Book removeBook (Book book) {
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.remove(book);
        session.getTransaction().commit();
        session.close();
        return book;
    }

}
