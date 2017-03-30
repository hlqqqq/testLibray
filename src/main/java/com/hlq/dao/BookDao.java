package com.hlq.dao;


import com.hlq.domain.Book;

/**
 * Created by heliqing on 2016/10/18.
 */
public interface BookDao {
    void save(Book book);
    void delete(Book book);
}
