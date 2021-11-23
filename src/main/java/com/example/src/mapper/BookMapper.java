package com.example.src.mapper;

import com.example.src.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //添加书
    int addBook(Book book);

    //删除书根据id
    int deleteBookById(@Param("id") int id);

    //更新书
    int updateBook(Book book);

    //查询书
    Book queryBookById(@Param("id") int id);

    //查询全部书
    List<Book> queryAllBook();
}
