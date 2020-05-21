package com.zyq.nongyezhongzhi.yield.service;

import java.util.List;

import com.zyq.nongyezhongzhi.yield.model.FruitsYieldModel;

//水果产量的业务接口
public interface IFruitsYieldService {

	 //增
	 public void craeate(FruitsYieldModel fruitsYieldModel) throws Exception;
	 
	 //修改数据
	 public void changepassword(String id,String yeardata,String monthlddata,String quarterdata) throws Exception;
	 
	//删除
	public void delete(FruitsYieldModel fruitsYieldModel) throws Exception;
	//取得所有用户列表
	//R方法取得列表
	public List<FruitsYieldModel> getListByAll() throws Exception;
}
