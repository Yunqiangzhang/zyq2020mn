package com.zyq.nongyezhongzhi.yield.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.yield.model.FruitsYieldModel;


//水果数据的Dao接口
public interface IFruitsYieldDao {
	//增加
	public void create(FruitsYieldModel fruitsYieldModel) throws Exception;
	//
	public void update(FruitsYieldModel fruitsYieldModel) throws Exception;
	//删除
	public void delete(FruitsYieldModel fruitsYieldModel) throws Exception;
	//查询列表
	public List<FruitsYieldModel> selectListByAll() throws Exception;
}
