package com.springboot.practise.ms.book.service.business.impl;

import com.springboot.practise.ms.book.service.dao.BookRepository;
import com.springboot.practise.ms.book.service.data.Book;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceImplTest {

    @InjectMocks
    @Autowired
    BookServiceImpl bookService;

    @Mock
    BookRepository bookRepository;

    @Test
    public void testAddBook(){

//        doNothing().when(bookRepository.save(Book.class));
        bookService.add(new Book(1, "tt", "tt2"));
//        verify(bookRepository, times(1)).save(Book.class);

    }


}
