package org.example.exercise_6;


import org.example.exercise_6.entity.Author;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class AuthorHelper {

    private SessionFactory sessionFactory;

    public AuthorHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Author> getAuthorList(){
        // открыть сессию - для манипуляции с персист. объектами
        Session session = sessionFactory.openSession();

        Criteria cb = session.createCriteria(Author.class);// не использовать session.createCriteria, т.к. deprecated

        List<Author> authorList = cb.list();

        session.close();

        return authorList;
    }

    public Author getAuthorById(long id) {
        Session session = sessionFactory.openSession();
        Author author = session.get(Author.class, id);
        return author;
    }

    public Author addAuthor(Author author){

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(author);

        session.getTransaction().commit();

        session.close();

        return author;

    }

    public Author removeAuthor(Author author){

        Session session = sessionFactory.openSession();

        session.beginTransaction();

       session.remove(author);

        session.getTransaction().commit();

        session.close();

        return author;

    }
}
