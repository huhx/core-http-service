package com.linux.huhx.http.domain;

public class People {

  public People(String id, String username, Integer age) {
    this.id = id;
    this.username = username;
    this.age = age;
  }

  private String id;

  private String username;

  private Integer age;

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
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

}
