package com.springboot.shadingjdbc.entity.system;

import java.io.Serializable;

public class UserRole implements Serializable {

  private Long userRoleId;

  private Long userId;

  private String roleName;

  public Long getUserRoleId() {
    return userRoleId;
  }

  public void setUserRoleId(Long userRoleId) {
    this.userRoleId = userRoleId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }
}
