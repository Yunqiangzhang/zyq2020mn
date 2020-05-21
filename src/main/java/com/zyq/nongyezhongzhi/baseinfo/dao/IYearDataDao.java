package com.zyq.nongyezhongzhi.baseinfo.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.YearDataModel;

//年度数据的Dao接口
public interface IYearDataDao {
	   //增加
		public void create(YearDataModel yearDataModel) throws Exception;
		//
		public void update(YearDataModel yearDataModel) throws Exception;
		//删除
		public void delete(YearDataModel yearDataModel) throws Exception;
		//查询列表
		public List<YearDataModel> selectListByAll() throws Exception;
	
}
