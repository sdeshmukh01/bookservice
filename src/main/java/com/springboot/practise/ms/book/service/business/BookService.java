package com.springboot.practise.ms.book.service.business;

import com.springboot.practise.ms.book.service.data.Book;

import java.util.List;

public interface BookService {


    void add(Book book);

    void delete(Long id);

    Book get(Long id);

    void addAll(List<Book> books);

    List<Book> getAll();


    }

