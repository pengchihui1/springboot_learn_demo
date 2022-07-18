package com.example.diyu.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.example.diyu.demo.entity.Book ;
public interface BookDao extends JpaRepository<Book,Integer>, JpaSpecificationExecutor<Book> {


}
