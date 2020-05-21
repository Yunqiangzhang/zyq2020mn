package com.zyq.nongyezhongzhi.baseinfo.model;

import java.io.Serializable;
//月度数据Model类
public class QuarterDataModel implements Serializable {
	private String id=null;
	private String wheatyield=null;
	private String riceyield=null;
	private String fruitsyield=null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWheatyield() {
		return wheatyield;
	}
	public void setWheatyield(String wheatyield) {
		this.wheatyield = wheatyield;
	}
	public String getRiceyield() {
		return riceyield;
	}
	public void setRiceyield(String riceyield) {
		this.riceyield = riceyield;
	}
	public String getFruitsyield() {
		return fruitsyield;
	}
	public void setFruitsyield(String fruitsyield) {
		this.fruitsyield = fruitsyield;
	}
	
	
}
