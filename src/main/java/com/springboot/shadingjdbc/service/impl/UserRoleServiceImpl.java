package com.springboot.shadingjdbc.service.impl;

import com.springboot.shadingjdbc.entity.User;
import com.springboot.shadingjdbc.entity.UserRole;
import com.springboot.shadingjdbc.repository.UserRoleRepository;
import com.springboot.shadingjdbc.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

  @Autowired UserRoleRepository userRoleRepository;

  @Override
  public Long addUserRole(UserRole userRole) {
    // 强制路由主库
    // HintManager.getInstance().setMasterRouteOnly();
    return userRoleRepository.addUserRole(userRole);
  }

  @Override
  public List<User> list() {
    return userRoleRepository.list();
  }

  @Override
  public void deleteAll() {
    userRoleRepository.deleteAll();
  }
}
