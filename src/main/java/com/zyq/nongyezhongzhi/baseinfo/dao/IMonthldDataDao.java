package com.zyq.nongyezhongzhi.baseinfo.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.MonthldDataModel;



//月度数据的Dao接口
public interface IMonthldDataDao {
	   //增加
		public void create(MonthldDataModel monthldDataModel) throws Exception;
		//
		public void update(MonthldDataModel monthldDataModel) throws Exception;
		//删除
		public void delete(MonthldDataModel monthldDataModel) throws Exception;
		//查询列表
		public List<MonthldDataModel> selectListByAll() throws Exception;
	
}
