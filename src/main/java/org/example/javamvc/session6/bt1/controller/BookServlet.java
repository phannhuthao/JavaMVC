package org.example.javamvc.session6.bt1.controller;

import org.example.javamvc.session6.bt1.model.Book;
import org.example.javamvc.session6.bt1.service.BookService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class BookServlet extends HttpServlet {
    private final BookService service = new BookService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String path = "";

        if (action == null) {
            List<Book> books = service.getAllBooks();
            request.setAttribute("books", books);
            path = "/listBook.jsp";
        } else {
            switch (action) {
                case "add":
                    path = "Session6/Bt1/formAdd.jsp";
                    break;
                case "edit":
                    int id = Integer.parseInt(request.getParameter("id"));
                    Book book = service.getBookById(id);
                    request.setAttribute("book", book);
                    path = "Session6/Bt1/formEdit.jsp";
                    break;
            }
        }
        request.getRequestDispatcher(path).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("create".equals(action)) {
            Book book = new Book(0,
                    request.getParameter("title"),
                    request.getParameter("author"),
                    request.getParameter("category"),
                    Integer.parseInt(request.getParameter("quantity")));
            service.addBook(book);
        } else if ("update".equals(action)) {
            Book book = new Book(Integer.parseInt(request.getParameter("id")),
                    request.getParameter("title"),
                    request.getParameter("author"),
                    request.getParameter("category"),
                    Integer.parseInt(request.getParameter("quantity")));
            service.updateBook(book);
        } else if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            service.deleteBook(id);
        }

        response.sendRedirect(request.getContextPath() + "/books");
    }
}
