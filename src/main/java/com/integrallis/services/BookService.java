package com.integrallis.services;

import java.util.*;
import com.integrallis.domain.*;
import com.integrallis.exceptions.NotFoundException;
import static org.apache.commons.lang.StringUtils.isBlank;

public class BookService {

  static List<Book> books = new ArrayList<Book>();
  static List<Author> authors = new ArrayList<Author>();
  
  public boolean bookExists(String name) {
    boolean found = false;
    for (Book book : books) {
      if (book.getTitle().equals(name)) {
        found = true;
      }
    }
    return found;
  }
  
  public void delete(Book book) {
    books.remove(book);
  }

  public void delete(Author author) {
    authors.remove(author);
  }
  
  public void addBook(Book book) throws NotFoundException {
    if (isBlank(book.getTitle())) {
      throw new NotFoundException("Title was not set");
    }
    books.add(book);
    if (book.getAuthor() != null) {
      authors.add(book.getAuthor());
    }
  }

  public List<Book> getAllBooks() {
    return books;
  }

  public List<Author> getAllAuthors() {
    return authors;
  }
  
  public Book findBookByTitle(String name) {
    for (Book book : books) {
      if (book.getTitle().equals(name)) {
        return book;
      }
    }
    return null;
  }
}