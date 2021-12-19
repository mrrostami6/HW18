package com.book.book;

import entity.Book;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet
public class BookStore extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        Integer pageNumber = Integer.parseInt(request.getParameter("page-number"));
        String dateStr = request.getParameter("date");
        Date date = null;

        try {
            date = new SimpleDateFormat("ss/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Book book = new Book(name, author, date, pageNumber);

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}