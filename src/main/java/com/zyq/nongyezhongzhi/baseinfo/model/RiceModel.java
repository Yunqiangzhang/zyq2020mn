package com.zyq.nongyezhongzhi.baseinfo.model;
import java.io.Serializable;
//水稻Model类
public class RiceModel {
	private String id=null;
	private String yeardata=null;
	private String monthlddata=null;
	private String quarterdata=null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getYeardata() {
		return yeardata;
	}
	public void setYeardata(String yeardata) {
		this.yeardata = yeardata;
	}
	public String getMonthlddata() {
		return monthlddata;
	}
	public void setMonthlddata(String monthlddata) {
		this.monthlddata = monthlddata;
	}
	public String getQuarterdata() {
		return quarterdata;
	}
	public void setQuarterdata(String quarterdata) {
		this.quarterdata = quarterdata;
	}
}
