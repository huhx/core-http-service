package com.linux.huhx.http.domain;

import java.util.Date;

public class People {

  public People(String id, String username, Integer age, Date birthday) {
    this.id = id;
    this.username = username;
    this.age = age;
    this.birthday = birthday;
  }

  private String id;

  private String username;

  private Integer age;

  private Date birthday;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
