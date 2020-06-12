package com.springboot.shadingjdbc.service;

import com.springboot.shadingjdbc.entity.system.User;
import com.springboot.shadingjdbc.entity.system.UserRole;

import java.util.List;

public interface UserRoleService {

  Long addUserRole(UserRole userRole);

  List<User> list();

  void deleteAll();
}
