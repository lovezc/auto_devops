package com.zc.devops.middleware.entity;


import java.io.Serializable;

/**
 * @Description  
 * @Author  29914
 */

public class ServiceMiddleware  implements Serializable {


	/**
	 * 服务id
	 */
	private Long serviceId;

	/**
	 * 服务对应中间件id
	 */
	private Long middlewareId;


  public Long getServiceId() {
    return serviceId;
  }

  public void setServiceId(Long serviceId) {
    this.serviceId = serviceId;
  }


  public Long getMiddlewareId() {
    return middlewareId;
  }

  public void setMiddlewareId(Long middlewareId) {
    this.middlewareId = middlewareId;
  }

}
