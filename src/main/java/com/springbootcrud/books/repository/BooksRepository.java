package com.springbootcrud.books.repository;

import java.util.List;
import java.util.Optional;

import com.springbootcrud.books.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {
  Optional<Book> findById(long id);

}