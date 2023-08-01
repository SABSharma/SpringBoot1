package org.example.Annotations;

import java.util.List;

public interface BookRepository {
    public List<Book> findnewBooks(int greatethanprice);
}
