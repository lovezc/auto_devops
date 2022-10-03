package com.zc.devops.middleware.entity;

import java.io.Serializable;

/**
 * @Description  
 * @Author  29914
 */


public class Middleware  implements Serializable {


	/**
	 * 中间件id
	 */
	private Long middlewareId;

	/**
	 * 中间件名称
	 */
	private String middlewareName;

	/**
	 * 中间件版本
	 */
	private String middlewareVersion;

	/**
	 * 中间件ip地址
	 */
	private String middlewareIp;

	/**
	 * 中间件地址端口号
	 */
	private Long middlewarePort;

	/**
	 * 中间件用户名
	 */
	private String middlewareUser;

	/**
	 * 中间件密码
	 */
	private String middlewarePass;

	/**
	 * 中间件操作手册地址id
	 */
	private Long middlewareFileId;


  public Long getMiddlewareId() {
    return middlewareId;
  }

  public void setMiddlewareId(Long middlewareId) {
    this.middlewareId = middlewareId;
  }


  public String getMiddlewareName() {
    return middlewareName;
  }

  public void setMiddlewareName(String middlewareName) {
    this.middlewareName = middlewareName;
  }


  public String getMiddlewareVersion() {
    return middlewareVersion;
  }

  public void setMiddlewareVersion(String middlewareVersion) {
    this.middlewareVersion = middlewareVersion;
  }


  public String getMiddlewareIp() {
    return middlewareIp;
  }

  public void setMiddlewareIp(String middlewareIp) {
    this.middlewareIp = middlewareIp;
  }


  public Long getMiddlewarePort() {
    return middlewarePort;
  }

  public void setMiddlewarePort(Long middlewarePort) {
    this.middlewarePort = middlewarePort;
  }


  public String getMiddlewareUser() {
    return middlewareUser;
  }

  public void setMiddlewareUser(String middlewareUser) {
    this.middlewareUser = middlewareUser;
  }


  public String getMiddlewarePass() {
    return middlewarePass;
  }

  public void setMiddlewarePass(String middlewarePass) {
    this.middlewarePass = middlewarePass;
  }


  public Long getMiddlewareFileId() {
    return middlewareFileId;
  }

  public void setMiddlewareFileId(Long middlewareFileId) {
    this.middlewareFileId = middlewareFileId;
  }

}
