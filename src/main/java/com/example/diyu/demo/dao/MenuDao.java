package com.example.diyu.demo.dao;

import com.example.diyu.demo.entity.Menu ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MenuDao extends JpaRepository<Menu,Integer>, JpaSpecificationExecutor<Menu> {


}
