package com.zyq.nongyezhongzhi.admin.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.admin.model.GrowerModel;
//种植户的Dao接口
public interface IGrowerDao {
	       //增加
			public void create(GrowerModel growerModel) throws Exception;
			//
			public void update(GrowerModel growerModel) throws Exception;
			//删除
			public void delete(GrowerModel growerModel) throws Exception;
			//查询列表
			public List<GrowerModel> selectListByAll() throws Exception;
			//R方法-查询  查询返回单个对象，一般根据表的主键字段值获取
			public GrowerModel getById(String id) throws Exception;
}
