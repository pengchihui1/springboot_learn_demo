package com.example.diyu.demo.dao;

import com.example.diyu.demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleDao extends JpaRepository<Role,Integer>, JpaSpecificationExecutor<Role> {


}
