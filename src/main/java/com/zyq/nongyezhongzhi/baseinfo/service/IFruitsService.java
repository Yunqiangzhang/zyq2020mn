package com.zyq.nongyezhongzhi.baseinfo.service;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.FruitsModel;

//水果的业务接口
public interface IFruitsService {
	//增加
		public void create(FruitsModel fruitsModel) throws Exception;
		 //修改
		 public void modify(FruitsModel fruitsModel) throws Exception;
		 //删除
		 public void delete(FruitsModel fruitsModel) throws Exception;
		 //修改数据
		 public void changepassword(String yield) throws Exception;
		//取得所有用户列表
		public List<FruitsModel> getListByAll() throws Exception;
	 
}
