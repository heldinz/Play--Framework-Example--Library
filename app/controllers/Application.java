package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        List<Book> books = Book.findAll();
        render(books);
    }
    
    public static void borrowBook(Long bookId) {
        Book book = Book.findById(bookId);
        book.checkOut();
        flash.success("You have checked out %s", book.title);
        index();
    }

}