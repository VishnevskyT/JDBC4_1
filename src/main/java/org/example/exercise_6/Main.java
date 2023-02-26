package org.example.exercise_6;




import org.example.exercise_6.entity.Book;



import java.util.List;

public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        BookHelper bh = new BookHelper();

//        Book book = new Book();
//        book.setName("The Forest Song");
//        book.setAuthor_id(19);
//        bh.addBook(book);

        List<Book> bookList = bh.getBookList();

        for (Book b : bookList) {
            System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor_id());
        }

        Book book = bh.getBookById(3);
        System.out.println(book.getId() + " " + book.getName());




//        Author author = new Author();
//        author.setName("Тарас Григорович Шевченко");
//        ah.addAuthor(author);

//        for (int i = 3; i <= 14; i++) {
//            ah.removeAuthor(ah.getAuthorById(i));
//        }

//        ah.removeAuthor(ah.getAuthorById(2));


//        String[] names = {"Ivan Kotlyarevsky", "Taras Shevchenko", "Ivan Franko", "Mykhailo Kotsiubynsky", "Lesya Ukrainka"};
//
//        for (String name : names) {
//            Author author = new Author();
//            author.setName(name);
//            ah.addAuthor(author);
//        }

//        List<Author> authorList = ah.getAuthorList();
//
//        for (Author author : authorList) {
//            System.out.println(author.getId() + " " + author.getName());
//        }

//        Author a = ah.getAuthorById(3);
//        System.out.println(a.getName());
    }




}
