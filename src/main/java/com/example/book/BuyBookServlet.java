package com.example.book;

import com.example.User.User;
import com.example.User.UserManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/buyBook")
public class BuyBookServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ServletException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");  // Boshqa ma'lumotlar ham olinganligiga ishonishingiz mumkin
        String bookTitle = request.getParameter("bookTitle");


        String password = null;
        User user = new User(username, email, password);


        UserManager.addUser(user);




        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/buyBookResult.jsp");
        dispatcher.forward(request, response);
    }

}
