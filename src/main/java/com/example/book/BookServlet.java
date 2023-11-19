package com.example.book;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/books")
public class BookServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchQuery = request.getParameter("bookName");
        List<Book> books;

        if (searchQuery != null && !searchQuery.isEmpty()) {
            books = searchBooks(searchQuery);
        } else {
            books = BookRepository.getAllBooks();
        }

        request.setAttribute("books", books);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/books.jsp");
        dispatcher.forward(request, response);
    }

    private List<Book> searchBooks(String query) {
        List<Book> allBooks = BookRepository.getAllBooks();
        List<Book> searchResults = new ArrayList<>();

        for (Book book : allBooks) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase())) {
                searchResults.add(book);
            }
        }

        return searchResults;
    }
}
