package com.springboot.practise.ms.book.service.controller;

import com.springboot.practise.ms.book.service.business.BookService;
import com.springboot.practise.ms.book.service.data.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bookService")
public class BookController {

    @Autowired
    BookService bookService;


    @PostMapping(value = "/book", consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody Book book){

            bookService.add(book);
    }

    @DeleteMapping(value = "/book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteBook(@RequestBody Long id){
        bookService.delete(id);
    }

    @GetMapping(value = "/book")
    public Book getBook(@PathVariable Long id){

        return bookService.get(id);
    }

    @PostMapping(value = "/books", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addAll(List<Book> books){

         bookService.addAll(books);
    }

    @GetMapping(value = "/books")
    public List<Book> getBooks(){

        return bookService.getAll();
    }
}
