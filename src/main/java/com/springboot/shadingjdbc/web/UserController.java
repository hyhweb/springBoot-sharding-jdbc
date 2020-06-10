package com.springboot.shadingjdbc.web;

import com.springboot.shadingjdbc.entity.User;
import com.springboot.shadingjdbc.entity.UserRole;
import com.springboot.shadingjdbc.service.UserRoleService;
import com.springboot.shadingjdbc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
  Logger logger = LoggerFactory.getLogger(UserController.class);
  @Autowired private UserService userService;
  @Autowired private UserRoleService userRoleService;

  @GetMapping("/users")
  public Object list() {
    List<User> list = userService.list();
    // Collections.sort(list);
    return list;
  }

  @GetMapping("/getUserRoleByUserId")
  public List<Object> getUserRoleByUserId(@RequestParam("userId") Long userId) {
    List<Object> list = userService.getUserRoleByUserId(userId);
    return list;
  }

  @GetMapping("/add")
  @Transactional(readOnly = false)
  public Object add() {
    //        for (int i = 10000; i <50000; i++) {
    //            customMultiThreadingService.executeAsyncTask1(i);
    //        }
    // ds1.t_user_0
    //    User user = new User();
    //    user.setGender(1);
    //    user.setUserId(1000L);
    //    user.setUsername("LiHuai");
    //    userService.addUser(user);
    //
    //    // ds1.t_user_1
    //    User user2 = new User();
    //    user2.setGender(1);
    //    user2.setUserId(1001L);
    //    user2.setUsername("YeKai");
    //    userService.addUser(user2);
    //
    //    // ds0.t_user_0
    //    User user3 = new User();
    //    user3.setGender(2);
    //    user3.setUserId(1002L);
    //    user3.setUsername("luxiaofeng");
    //    userService.addUser(user3);
    //
    //    // ds0.t_user_1
    //    User user4 = new User();
    //    user4.setGender(2);
    //    user4.setUserId(1003L);
    //   user4.setUsername("chuliuxiang");
    //    userService.addUser(user4);

    for (int i = 50; i < 100; i++) {
      User user4 = new User();
      user4.setGender((i % 2) + 1);
      user4.setUserId(Long.valueOf(i));
      user4.setUsername("chuliuxiang");
      userService.addUser(user4);
      UserRole userRole = new UserRole();
      userRole.setUserRoleId(Long.valueOf(i));
      userRole.setRoleName("admin" + i);
      userRole.setUserId(Long.valueOf(i));
      userRoleService.addUserRole(userRole);
    }

    return "ok";
  }

  @GetMapping("/delete")
  public Object delete() {
    userService.deleteAll();
    return "ok";
  }
}
