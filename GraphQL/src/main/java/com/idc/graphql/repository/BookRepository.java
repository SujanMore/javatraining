package com.idc.graphql.repository;

import com.idc.graphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {

}
