package com.example.src.service;

import com.example.src.entity.Book;
import com.example.src.mapper.BookMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Setter
@Service
public class BookServiceImpl implements BookService {
    BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
