package com.zyq.nongyezhongzhi.baseinfo.service;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.WheatModel;


//玉米的业务接口
public interface IWheatService {
	
	    //增
	 public void craeate(WheatModel wheatModel) throws Exception;
	 
	 //修改数据
	 public void changeyield(String yield) throws Exception;
	 
	//删除
	public void delete(WheatModel wheatModel) throws Exception;
		
		//取得所有用户列表
		//R方法-查询  取得列表
		public List<WheatModel> getListByAll() throws Exception;
		

}
