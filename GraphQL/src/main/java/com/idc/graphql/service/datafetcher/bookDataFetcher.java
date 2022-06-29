package com.idc.graphql.service.datafetcher;

import com.idc.graphql.model.Book;
import com.idc.graphql.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class bookDataFetcher implements DataFetcher<Book> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book get(DataFetchingEnvironment environment) throws Exception {

        String isn = environment.getArgument("id");
        return bookRepository.findById(isn).get();
    }
}
