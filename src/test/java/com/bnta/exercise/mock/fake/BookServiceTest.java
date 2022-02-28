package com.bnta.exercise.mock.fake;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    public void testFake(){
        BookRepository bookRepository = new FakeBookRepository();

        BookService bookService = new BookService(bookRepository);
        bookService.addBook(new Book("1234","mockito in action",250, LocalDate.now()));
        bookService.addBook(new Book("1235","Junit5 in action",200, LocalDate.now()));

        assertEquals(2,bookService.findNumberOfBooks());



    }


}