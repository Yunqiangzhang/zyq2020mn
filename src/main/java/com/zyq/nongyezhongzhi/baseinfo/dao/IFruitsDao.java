package com.zyq.nongyezhongzhi.baseinfo.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.FruitsModel;


//水果的Dao接口
public interface IFruitsDao {
	//增加
			public void create(FruitsModel fruitsModel) throws Exception;
			//
			public void update(FruitsModel fruitsModel) throws Exception;
			//删除
			public void delete(FruitsModel fruitsModel) throws Exception;
			//查询列表
			public List<FruitsModel> selectListByAll() throws Exception;
		
	
}
