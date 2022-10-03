package com.zc.devops.register.entity;

public class Root {

  private long rootId;
  private String rootName;
  private String rootPass;
  private long rootPhone;
  private String rootEmail;
  private long rootAuth;
  private java.sql.Timestamp rootRegtime;
  private java.sql.Timestamp rootDeltime;


  public long getRootId() {
    return rootId;
  }

  public void setRootId(long rootId) {
    this.rootId = rootId;
  }


  public String getRootName() {
    return rootName;
  }

  public void setRootName(String rootName) {
    this.rootName = rootName;
  }


  public String getRootPass() {
    return rootPass;
  }

  public void setRootPass(String rootPass) {
    this.rootPass = rootPass;
  }


  public long getRootPhone() {
    return rootPhone;
  }

  public void setRootPhone(long rootPhone) {
    this.rootPhone = rootPhone;
  }


  public String getRootEmail() {
    return rootEmail;
  }

  public void setRootEmail(String rootEmail) {
    this.rootEmail = rootEmail;
  }


  public long getRootAuth() {
    return rootAuth;
  }

  public void setRootAuth(long rootAuth) {
    this.rootAuth = rootAuth;
  }


  public java.sql.Timestamp getRootRegtime() {
    return rootRegtime;
  }

  public void setRootRegtime(java.sql.Timestamp rootRegtime) {
    this.rootRegtime = rootRegtime;
  }


  public java.sql.Timestamp getRootDeltime() {
    return rootDeltime;
  }

  public void setRootDeltime(java.sql.Timestamp rootDeltime) {
    this.rootDeltime = rootDeltime;
  }

}
