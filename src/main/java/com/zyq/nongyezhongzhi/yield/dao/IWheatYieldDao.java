package com.zyq.nongyezhongzhi.yield.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.yield.model.WheatYieldModel;



//产量数据的Dao接口
public interface IWheatYieldDao {
	//增加
	public void create(WheatYieldModel wheatYieldModel) throws Exception;
	//
	public void update(WheatYieldModel wheatYieldModel) throws Exception;
	//删除
	public void delete(WheatYieldModel wheatYieldModel) throws Exception;
	//查询列表
	public List<WheatYieldModel> selectListByAll() throws Exception;
}
