package com.springboot.practise.ms.book.service.dao;

import com.springboot.practise.ms.book.service.data.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
