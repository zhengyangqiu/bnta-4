package com.bnta.exercise.mock.fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements  BookRepository{

    // in memory database, hashmap or List rather than real database
    Map<String, Book> bookStore = new HashMap<>();


    @Override
    public void save(Book book) {

    }

    @Override
    public Collection<Book> findAll() {
        return null;
    }


}
