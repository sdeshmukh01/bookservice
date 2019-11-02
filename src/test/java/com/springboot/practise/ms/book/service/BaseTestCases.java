package com.springboot.practise.ms.book.service;


import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public class BaseTestCases {

    @BeforeEach
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
}
