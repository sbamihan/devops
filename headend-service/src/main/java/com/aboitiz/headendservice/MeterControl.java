package com.aboitiz.headendservice;

import java.util.Date;

public class MeterControl {

	private String serialNumber;
	private String status;
	private Date completeDttm;

	public MeterControl() {
	}

	public MeterControl(String serialNumber, String status, Date completeDttm) {
		this.serialNumber = serialNumber;
		this.status = status;
		this.completeDttm = completeDttm;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCompleteDttm() {
		return completeDttm;
	}

	public void setCompleteDttm(Date completeDttm) {
		this.completeDttm = completeDttm;
	}

	@Override
	public String toString() {
		return "MeterControl [serialNumber=" + serialNumber + ", status=" + status + ", completeDttm=" + completeDttm
				+ "]";
	}

}
