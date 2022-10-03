package com.zc.devops.fileupload.entity;


import java.io.Serializable;

/**
 * @Description  
 * @Author  29914
 */

public class Filesystem  implements Serializable {


	private Long filesystemId;

	/**
	 * 文件系统类型
	 */
	private String filesystemType;

	/**
	 * 文件系统ip
	 */
	private String filesystemIp;

	/**
	 * 文件系统端口
	 */
	private Long filesystemPort;

	/**
	 * 登录用户
	 */
	private String filesystemUser;

	/**
	 * 登录密码
	 */
	private String filesystemPass;


  public Long getFilesystemId() {
    return filesystemId;
  }

  public void setFilesystemId(Long filesystemId) {
    this.filesystemId = filesystemId;
  }


  public String getFilesystemType() {
    return filesystemType;
  }

  public void setFilesystemType(String filesystemType) {
    this.filesystemType = filesystemType;
  }


  public String getFilesystemIp() {
    return filesystemIp;
  }

  public void setFilesystemIp(String filesystemIp) {
    this.filesystemIp = filesystemIp;
  }


  public Long getFilesystemPort() {
    return filesystemPort;
  }

  public void setFilesystemPort(Long filesystemPort) {
    this.filesystemPort = filesystemPort;
  }


  public String getFilesystemUser() {
    return filesystemUser;
  }

  public void setFilesystemUser(String filesystemUser) {
    this.filesystemUser = filesystemUser;
  }


  public String getFilesystemPass() {
    return filesystemPass;
  }

  public void setFilesystemPass(String filesystemPass) {
    this.filesystemPass = filesystemPass;
  }

}
