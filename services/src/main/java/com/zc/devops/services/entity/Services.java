package com.sample;


public class Services {

  private long serviceId;
  private String serviceName;
  private String serviceDescribe;
  private String serviceCode;
  private String serviceIp;
  private String serviceVersion;
  private long serviceIsRelease;
  private java.sql.Timestamp serviceReleaseTime;
  private java.sql.Timestamp serviceUnloadTime;
  private long serviceFileId;


  public long getServiceId() {
    return serviceId;
  }

  public void setServiceId(long serviceId) {
    this.serviceId = serviceId;
  }


  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public String getServiceDescribe() {
    return serviceDescribe;
  }

  public void setServiceDescribe(String serviceDescribe) {
    this.serviceDescribe = serviceDescribe;
  }


  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public String getServiceIp() {
    return serviceIp;
  }

  public void setServiceIp(String serviceIp) {
    this.serviceIp = serviceIp;
  }


  public String getServiceVersion() {
    return serviceVersion;
  }

  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }


  public long getServiceIsRelease() {
    return serviceIsRelease;
  }

  public void setServiceIsRelease(long serviceIsRelease) {
    this.serviceIsRelease = serviceIsRelease;
  }


  public java.sql.Timestamp getServiceReleaseTime() {
    return serviceReleaseTime;
  }

  public void setServiceReleaseTime(java.sql.Timestamp serviceReleaseTime) {
    this.serviceReleaseTime = serviceReleaseTime;
  }


  public java.sql.Timestamp getServiceUnloadTime() {
    return serviceUnloadTime;
  }

  public void setServiceUnloadTime(java.sql.Timestamp serviceUnloadTime) {
    this.serviceUnloadTime = serviceUnloadTime;
  }


  public long getServiceFileId() {
    return serviceFileId;
  }

  public void setServiceFileId(long serviceFileId) {
    this.serviceFileId = serviceFileId;
  }

}
