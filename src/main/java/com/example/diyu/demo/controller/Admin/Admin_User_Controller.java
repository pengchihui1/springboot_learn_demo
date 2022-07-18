package com.example.diyu.demo.controller.Admin;

import com.example.diyu.demo.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/admin/user")
public class Admin_User_Controller {
  @Resource
   private UserDao userDao;

}
