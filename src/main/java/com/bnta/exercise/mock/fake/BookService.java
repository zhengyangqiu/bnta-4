package com.bnta.exercise.mock.fake;

public class BookService {
    //talk to the database
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public void addBook(Book book){
        bookRepository.save(book);

    }

    public int findNumberOfBooks(){
        return bookRepository.findAll().size();
    }
}
