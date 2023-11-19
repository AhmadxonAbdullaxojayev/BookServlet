package com.example.book;
import java.util.ArrayList;
import java.util.List;


public class BookRepository {
    public static final List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("Brave New World", "Aldous Huxley", 10, new int[]{10, 20}));
        books.add(new Book("The Chronicles of Narnia", "C.S. Lewis", 15, new int[]{15, 30}));
        books.add(new Book("The Da Vinci Code", "Dan Brown", 10, new int[]{10, 25}));
        books.add(new Book("The Alchemist", "Paulo Coelho", 10, new int[]{10, 20}));
        books.add(new Book("The Shining", "Stephen King", 10, new int[]{10, 25}));
        books.add(new Book("The Kite Runner", "Khaled Hosseini", 12, new int[]{12, 25}));
        books.add(new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", 10, new int[]{10, 20}));
        books.add(new Book("The Color Purple", "Alice Walker", 8, new int[]{8, 18}));
        books.add(new Book("The Road", "Cormac McCarthy", 10, new int[]{10, 20}));
        books.add(new Book("Gone with the Wind", "Margaret Mitchell", 12, new int[]{12, 30}));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 10, new int[]{10, 20}));
        books.add(new Book("1984", "George Orwell", 10, new int[]{10, 25}));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 8, new int[]{8, 18}));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 10, new int[]{10, 20}));
        books.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 12, new int[]{12, 25}));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 8, new int[]{8, 18}));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 15, new int[]{15, 35}));
        books.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 15, new int[]{15, 25}));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 10, new int[]{10, 20}));
        books.add(new Book("The Hunger Games", "Suzanne Collins", 10, new int[]{10, 20}));

    }

    public static List<Book> getAllBooks() {
        return books;
    }
}
