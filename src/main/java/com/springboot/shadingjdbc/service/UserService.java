package com.springboot.shadingjdbc.service;

import com.springboot.shadingjdbc.entity.User;

import java.util.List;

public interface UserService {

  Long addUser(User user);

  List<User> list();

  List<Object> getUserRoleByUserId(Long userId);

  void deleteAll();
}
