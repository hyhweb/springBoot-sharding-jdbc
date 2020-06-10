package com.springboot.shadingjdbc.service.impl;

import com.springboot.shadingjdbc.entity.User;
import com.springboot.shadingjdbc.repository.UserRepository;
import com.springboot.shadingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Autowired UserRepository userRepository;

  @Override
  public Long addUser(User user) {

    // 强制路由主库
    // HintManager.getInstance().setMasterRouteOnly();
    return userRepository.addUser(user);
  }

  @Override
  public List<User> list() {

    return userRepository.list();
  }

  @Override
  public List<Object> getUserRoleByUserId(Long userId) {
    return userRepository.getUserRoleByUserId(userId);
  }

  @Override
  public void deleteAll() {
    userRepository.deleteAll();
  }
}
