package com.zc.devops.register.entity;


public class Auth {

  private long authId;
  private long authUserGrant;
  private long authServices;
  private long authSystem;
  private long authFile;
  private long authMiddleware;
  private long isDel;


  public long getAuthId() {
    return authId;
  }

  public void setAuthId(long authId) {
    this.authId = authId;
  }


  public long getAuthUserGrant() {
    return authUserGrant;
  }

  public void setAuthUserGrant(long authUserGrant) {
    this.authUserGrant = authUserGrant;
  }


  public long getAuthServices() {
    return authServices;
  }

  public void setAuthServices(long authServices) {
    this.authServices = authServices;
  }


  public long getAuthSystem() {
    return authSystem;
  }

  public void setAuthSystem(long authSystem) {
    this.authSystem = authSystem;
  }


  public long getAuthFile() {
    return authFile;
  }

  public void setAuthFile(long authFile) {
    this.authFile = authFile;
  }


  public long getAuthMiddleware() {
    return authMiddleware;
  }

  public void setAuthMiddleware(long authMiddleware) {
    this.authMiddleware = authMiddleware;
  }


  public long getIsDel() {
    return isDel;
  }

  public void setIsDel(long isDel) {
    this.isDel = isDel;
  }

}
