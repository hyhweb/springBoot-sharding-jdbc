package com.springboot.shadingjdbc.repository;

import com.springboot.shadingjdbc.entity.system.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository {

  Long addUser(User user);

  List<User> list();

  List<Object> getUserRoleByUserId(Long userId);

  void deleteAll();
}
