/**
 * 
 */
package com.mvc.rest.entity;

/**
 * @ClassName: Car
 * @Description: TODO
 * @author zhangxian
 * @createDate 2016年3月21日
 * @copyright: Copyright® 2016 POSTEL
 */
public class Car {
	private String carId;

	private String carNo;

	private String driver;

	private String bak;

	private String userId;

	private String carStatusId;

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getBak() {
		return bak;
	}

	public void setBak(String bak) {
		this.bak = bak;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCarStatusId() {
		return carStatusId;
	}

	public void setCarStatusId(String carStatusId) {
		this.carStatusId = carStatusId;
	}

}
