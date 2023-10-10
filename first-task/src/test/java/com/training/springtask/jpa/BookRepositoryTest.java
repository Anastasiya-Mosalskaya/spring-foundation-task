package com.training.springtask.jpa;

import com.training.springtask.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testThatBookIsSavedToDatabase() {
        bookRepository.save(new Book("Hotel", "Arthur Hailey"));
        List<Book> books = (List<Book>) bookRepository.findAll();
        Book book = books.get(0);
        assertNotNull(book);
        assertEquals("Hotel", book.getName());
    }
}
