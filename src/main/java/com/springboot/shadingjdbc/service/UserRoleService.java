package com.springboot.shadingjdbc.service;

import com.springboot.shadingjdbc.entity.User;
import com.springboot.shadingjdbc.entity.UserRole;

import java.util.List;

public interface UserRoleService {

  Long addUserRole(UserRole userRole);

  List<User> list();

  void deleteAll();
}
