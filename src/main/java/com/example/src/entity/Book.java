package com.example.src.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    int bookId;
    String bookName;
    int bookCounts;
    String detail;
}
