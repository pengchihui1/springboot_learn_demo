package com.example.diyu.demo.dao;

import com.example.diyu.demo.entity.BookType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookTypeDao extends JpaRepository<BookType,Integer>, JpaSpecificationExecutor<BookType> {


}
