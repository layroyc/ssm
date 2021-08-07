package com.hp.entity;

public class Business {
	private Integer bId;
	private String bNum;
	private String bType;
	private String bMark;
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String getbNum() {
		return bNum;
	}
	public void setbNum(String bNum) {
		this.bNum = bNum;
	}
	public String getbType() {
		return bType;
	}
	public void setbType(String bType) {
		this.bType = bType;
	}
	public String getbMark() {
		return bMark;
	}
	public void setbMark(String bMark) {
		this.bMark = bMark;
	}
	public Business(Integer bId, String bNum, String bType, String bMark) {
		super();
		this.bId = bId;
		this.bNum = bNum;
		this.bType = bType;
		this.bMark = bMark;
	}
	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Business [bId=" + bId + ", bNum=" + bNum + ", bType=" + bType
				+ ", bMark=" + bMark + "]";
	}
	
	

}
