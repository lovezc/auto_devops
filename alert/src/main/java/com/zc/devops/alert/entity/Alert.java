package com.zc.devops.alert.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  29914
 */

public class Alert  implements Serializable {


	private Long alertId;

	/**
	 * 警报类型：被攻击，资源占用，服务发生错误
	 */
	private String alertType;

	/**
	 * 警报时间
	 */
	private Date alertTime;

	/**
	 * 发生警报的服务或者系统
	 */
	private Long alertServiceId;

	/**
	 * 警报详细信息
	 */
	private String alertDetailed;


  public Long getAlertId() {
    return alertId;
  }

  public void setAlertId(Long alertId) {
    this.alertId = alertId;
  }


  public String getAlertType() {
    return alertType;
  }

  public void setAlertType(String alertType) {
    this.alertType = alertType;
  }


  public Date getAlertTime() {
    return alertTime;
  }

  public void setAlertTime(Date alertTime) {
    this.alertTime = alertTime;
  }


  public Long getAlertServiceId() {
    return alertServiceId;
  }

  public void setAlertServiceId(Long alertServiceId) {
    this.alertServiceId = alertServiceId;
  }


  public String getAlertDetailed() {
    return alertDetailed;
  }

  public void setAlertDetailed(String alertDetailed) {
    this.alertDetailed = alertDetailed;
  }

}
