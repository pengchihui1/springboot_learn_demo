package com.example.diyu.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.example.diyu.demo.entity.Permission;
public interface RermissionDao extends JpaRepository<Permission,Integer>, JpaSpecificationExecutor<Permission> {


}
