package com.zyq.nongyezhongzhi.baseinfo.service;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.MonthldDataModel;

//月度数据的业务接口
public interface IMonthldDataService {
	   //增加
		public void create(MonthldDataModel monthldDataModel) throws Exception;
		 //修改
		 public void modify(MonthldDataModel monthldDataModel) throws Exception;
		 //删除
		 public void delete(MonthldDataModel monthldDataModel) throws Exception;
		 //修改数据
		 public void changemonthlddata(String monthlddata) throws Exception;
		//取得所有用户列表
		
		public List<MonthldDataModel> getListByAll() throws Exception;

}
