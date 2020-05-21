package com.zyq.nongyezhongzhi.baseinfo.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.QuarterDataModel;


//季度数据的Dao接口
public interface IQuaretrDataDao {
	   //增加
		public void create(QuarterDataModel quarterDataModel) throws Exception;
		//
		public void update(QuarterDataModel quarterDataModel) throws Exception;
		//删除
		public void delete(QuarterDataModel quarterDataModel) throws Exception;
		//查询列表
		public List<QuarterDataModel> selectListByAll() throws Exception;
	
}
