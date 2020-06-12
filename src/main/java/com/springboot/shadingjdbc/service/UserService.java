package com.springboot.shadingjdbc.service;

import com.springboot.shadingjdbc.entity.system.User;

import java.util.List;

public interface UserService {

  Long addUser(User user);

  List<User> list();

  List<Object> getUserRoleByUserId(Long userId);

  void deleteAll();
}
