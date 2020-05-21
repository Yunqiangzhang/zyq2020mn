package com.zyq.nongyezhongzhi.yield.service;

import java.util.List;

import com.zyq.nongyezhongzhi.yield.model.RiceYieldModel;
import com.zyq.nongyezhongzhi.yield.model.WheatYieldModel;

//水稻玉米产量的业务接口
public interface IRiceYieldService {

	 //增
	 public void craeate(RiceYieldModel riceYieldModel) throws Exception;
	 
	 //修改数据
	 public void changepassword(String id,String yeardata,String monthlddata,String quarterdata) throws Exception;
	 
	//删除
	public void delete(RiceYieldModel riceYieldModel) throws Exception;
	//取得所有用户列表
		//R方法-查询  取得列表
		public List<RiceYieldModel> getListByAll() throws Exception;
}
