package com.springboot.shadingjdbc.repository;

import com.springboot.shadingjdbc.entity.system.User;
import com.springboot.shadingjdbc.entity.system.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleRepository {

  Long addUserRole(UserRole userRole);

  List<User> list();

  void deleteAll();
}
