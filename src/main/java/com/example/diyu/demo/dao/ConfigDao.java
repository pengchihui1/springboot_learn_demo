package com.example.diyu.demo.dao;

import com.example.diyu.demo.entity.Config ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ConfigDao extends JpaRepository<Config,Integer>, JpaSpecificationExecutor<Config> {


}
