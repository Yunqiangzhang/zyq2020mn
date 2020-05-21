package com.zyq.nongyezhongzhi.yield.service;

import java.util.List;

import com.zyq.nongyezhongzhi.yield.model.WheatYieldModel;

//玉米产量的业务接口
public interface IWheatYieldService {

	 //增
	 public void craeate(WheatYieldModel wheatYieldModel) throws Exception;
	 
	 //修改数据
	 public void changepassword(String id,String yeardata,String monthlddata,String quarterdata) throws Exception;
	 
	//删除
	public void delete(WheatYieldModel wheatYieldModel) throws Exception;
	//取得所有用户列表
		//R方法-查询  取得列表
		public List<WheatYieldModel> getListByAll() throws Exception;
}
