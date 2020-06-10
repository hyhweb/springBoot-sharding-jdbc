package com.springboot.shadingjdbc.entity;

import java.io.Serializable;

public class User implements Serializable {

  private Long userId;

  /** 性别 1-男；2-女 */
  private Integer gender;

  private String username;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
