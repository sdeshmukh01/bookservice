package com.springboot.practise.ms.book.service.business.impl;

import com.springboot.practise.ms.book.service.business.BookService;
import com.springboot.practise.ms.book.service.dao.BookRepository;
import com.springboot.practise.ms.book.service.data.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

@Autowired
    BookRepository bookRepository;

    @Override
    public void add(Book book) {

        bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {

        bookRepository.deleteById(id);
    }

    @Override
    public Book get(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void addAll(List<Book> books) {
            bookRepository.saveAll(books);
    }

    @Override
    public List<Book> getAll() {
       return bookRepository.findAll();
    }
}
