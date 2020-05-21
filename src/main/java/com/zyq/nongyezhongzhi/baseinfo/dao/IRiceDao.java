package com.zyq.nongyezhongzhi.baseinfo.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.RiceModel;


//水稻的Dao接口
public interface IRiceDao {
	//增加
			public void create(RiceModel riceModel) throws Exception;
			//
			public void update(RiceModel riceModel) throws Exception;
			//删除
			public void delete(RiceModel riceModel) throws Exception;
			//查询列表
			public List<RiceModel> selectListByAll() throws Exception;
		
	
}
