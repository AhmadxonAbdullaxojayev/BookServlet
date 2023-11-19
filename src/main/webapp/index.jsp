<%@ page import="com.example.book.Book" %>
<%@ page import="static com.example.book.BookRepository.books" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kitoblar Jadvali</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
            margin: 20px auto;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<h2>Kitoblar Jadvali</h2>

<table>
    <thead>
    <tr>
        <th>Muallif</th>
        <th>Kitob nomi</th>
        <th>Narxi</th>
        <th>Chiqan sanasi</th>
    </tr>
    </thead>
    <tbody>
        <%
for (Book book : books) {
    String author = (book.getAuthor() != null) ? book.getAuthor() : "N/A";
    String title = (book.getTitle() != null) ? book.getTitle() : "N/A";
    String price = (book.getPrice() != null) ? book.getPrice().toString() : "N/A";
    String year = (book.getYear() != null) ? book.getYear().toString() : "N/A";
    int bookId = book.getId();

    %>
    <tr>
        <td><%= author %></td>
        <td><%= title %></td>
        <td><%= price %></td>
        <td><%= year %></td>
        <td>
            <form method="post" action="/buy-book">
                <input type="hidden" name="bookId" value="<%= bookId %>">
                <button type="submit">Kitobni sotib oling</button>
            </form>
        </td>
    </tr>
        <%
}
%><%
String author = request.getParameter("author");
%>
        <h2>Siz sotib olgan kitob:</h2>
        <p>Yozuvchi (Author): <%= author %></p>
</table>


</body>


<body>
<h1>Books</h1>


<form action="/search" method="get">
    <label for="bookName">Kitob nomi:</label>
    <input type="text" id="bookName" name="bookName">
    <button type="submit">Qidirish</button>
</form>

<%
    List<Book> books = (List<Book>)request.getAttribute("books");
    out.println("Books List in JSP: " + books);
%>
</body>

</html>
