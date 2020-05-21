package com.zyq.nongyezhongzhi.baseinfo.service;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.YearDataModel;


//年度数据的业务接口
public interface IYearDataService {
	    //增加
		public void create(YearDataModel yearDataModel) throws Exception;
		 //修改
		 public void modify(YearDataModel yearDataModel) throws Exception;
		 //删除
		 public void delete(YearDataModel yearDataModel) throws Exception;
		 //修改数据
		 public void changeyeardata(String yearData) throws Exception;
		//取得所有用户列表
		
		public List<YearDataModel> getListByAll() throws Exception;

}
