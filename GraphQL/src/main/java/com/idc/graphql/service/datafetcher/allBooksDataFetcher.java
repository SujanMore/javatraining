package com.idc.graphql.service.datafetcher;

import com.idc.graphql.model.Book;
import com.idc.graphql.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class allBooksDataFetcher implements DataFetcher<List<Book>> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> get(DataFetchingEnvironment environment) throws Exception {
        return bookRepository.findAll();
    }
}
