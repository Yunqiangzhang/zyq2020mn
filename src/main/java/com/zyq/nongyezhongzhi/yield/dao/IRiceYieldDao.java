package com.zyq.nongyezhongzhi.yield.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.yield.model.RiceYieldModel;
//水稻数据的Dao接口
public interface IRiceYieldDao {
	//增加
	public void create(RiceYieldModel riceYieldModel) throws Exception;
	//
	public void update(RiceYieldModel riceYieldModel) throws Exception;
	//删除
	public void delete(RiceYieldModel riceYieldModel) throws Exception;
	//查询列表
	public List<RiceYieldModel> selectListByAll() throws Exception;
}
