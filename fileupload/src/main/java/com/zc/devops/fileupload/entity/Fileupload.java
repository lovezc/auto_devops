package com.zc.devops.fileupload.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  29914
 */

public class Fileupload  implements Serializable {


	/**
	 * 文件id
	 */
	private Long fileId;

	/**
	 * 文件地址
	 */
	private String fileIp;

	/**
	 * 文件名称
	 */
	private String fileName;

	/**
	 * 上传人
	 */
	private Long fileUserId;

	/**
	 * 文件版本
	 */
	private String fileVersion;

	/**
	 * 上传时间
	 */
	private Date fileUploadTime;


  public Long getFileId() {
    return fileId;
  }

  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }


  public String getFileIp() {
    return fileIp;
  }

  public void setFileIp(String fileIp) {
    this.fileIp = fileIp;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public Long getFileUserId() {
    return fileUserId;
  }

  public void setFileUserId(Long fileUserId) {
    this.fileUserId = fileUserId;
  }


  public String getFileVersion() {
    return fileVersion;
  }

  public void setFileVersion(String fileVersion) {
    this.fileVersion = fileVersion;
  }


  public Date getFileUploadTime() {
    return fileUploadTime;
  }

  public void setFileUploadTime(Date fileUploadTime) {
    this.fileUploadTime = fileUploadTime;
  }

}
