package com.upao.ebook.service;

import com.upao.ebook.domain.Book;
import com.upao.ebook.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    //Inyeccion de dependencias
    private final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public Book createBook(Book book) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }
}
