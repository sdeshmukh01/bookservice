package com.springboot.practise.ms.book.service.controller;

import com.springboot.practise.ms.book.service.BaseTestCases;
import com.springboot.practise.ms.book.service.business.BookService;
import com.springboot.practise.ms.book.service.data.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@SpringBootTest

public class BookControllerTest extends BaseTestCases {

@InjectMocks
@Autowired
BookController controller;

@Mock
BookService bookService;

    @DisplayName("Test Book Controller")
    @Test
    public void testAddBook(){
        doNothing().when(bookService).add(any());
        controller.addBook(new Book());
        verify(bookService, times(1)).add(any(Book.class));
    }

    @DisplayName("Test Book Controller")
    @Test
    public void testGetBook(){

        Book book = new Book();
        book.setId(1);
        book.setAuthor("James Rusell");
        book.setGenre("Horror");
        book.setName("Tripping Point");
        book.setPrice(3.5);
        book.setRating(3.5);
        book.setYear(2019);

        when(bookService.get(anyLong())).thenReturn(book);
        Assertions.assertEquals(controller.getBook(1l), book);
        verify(bookService, times(1)).get(any(Long.class));
    }

    @DisplayName("Test Book Controller")
    @Test
    public void testDeleteBook(){

        controller.deleteBook(1l);
        verify(bookService, times(1)).delete(any(Long.class));
    }

    @DisplayName("Test Book Controller")
    @Test
    public void testAddBooks(){

        controller.addAll(Arrays.asList(new Book(1l, "test", "test"), new Book(2, "test2", "sam")));
        verify(bookService, times(1)).addAll(any(List.class));
    }
}
