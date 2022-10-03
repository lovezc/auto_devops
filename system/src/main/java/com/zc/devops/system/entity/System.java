package com.zc.devops.system.entity;


import java.io.Serializable;

/**
 * @Description  
 * @Author  29914
 */

public class System  implements Serializable {


	/**
	 * 系统id
	 */
	private Long systemId;

	private String systemIp;

	/**
	 * 系统用户名
	 */
	private String systemUser;

	/**
	 * 系统密码
	 */
	private String systemPass;


  public Long getSystemId() {
    return systemId;
  }

  public void setSystemId(Long systemId) {
    this.systemId = systemId;
  }


  public String getSystemIp() {
    return systemIp;
  }

  public void setSystemIp(String systemIp) {
    this.systemIp = systemIp;
  }


  public String getSystemUser() {
    return systemUser;
  }

  public void setSystemUser(String systemUser) {
    this.systemUser = systemUser;
  }


  public String getSystemPass() {
    return systemPass;
  }

  public void setSystemPass(String systemPass) {
    this.systemPass = systemPass;
  }

}
