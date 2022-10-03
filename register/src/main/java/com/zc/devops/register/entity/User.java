package com.zc.devops.register.entity;


public class User {

  private long userId;
  private String userName;
  private String userPass;
  private long userPhone;
  private String userEmail;
  private long userIsGrant;
  private long userAuth;
  private long userRoot;
  private java.sql.Timestamp userRegtime;
  private java.sql.Timestamp userDeltime;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPass() {
    return userPass;
  }

  public void setUserPass(String userPass) {
    this.userPass = userPass;
  }


  public long getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(long userPhone) {
    this.userPhone = userPhone;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public long getUserIsGrant() {
    return userIsGrant;
  }

  public void setUserIsGrant(long userIsGrant) {
    this.userIsGrant = userIsGrant;
  }


  public long getUserAuth() {
    return userAuth;
  }

  public void setUserAuth(long userAuth) {
    this.userAuth = userAuth;
  }


  public long getUserRoot() {
    return userRoot;
  }

  public void setUserRoot(long userRoot) {
    this.userRoot = userRoot;
  }


  public java.sql.Timestamp getUserRegtime() {
    return userRegtime;
  }

  public void setUserRegtime(java.sql.Timestamp userRegtime) {
    this.userRegtime = userRegtime;
  }


  public java.sql.Timestamp getUserDeltime() {
    return userDeltime;
  }

  public void setUserDeltime(java.sql.Timestamp userDeltime) {
    this.userDeltime = userDeltime;
  }

}
