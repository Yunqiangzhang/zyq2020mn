package com.zyq.nongyezhongzhi.yield.service;

import java.util.List;

import com.zyq.nongyezhongzhi.yield.model.YieldModel;

//产量的业务接口
public interface IYieldService {
	   //增加
		public void create(YieldModel yielModel) throws Exception;
		//
		public void update(YieldModel yielModel) throws Exception;
		//删除
		public void delete(YieldModel yielModel) throws Exception;
		//查询列表
		public List<YieldModel> selectListByAll() throws Exception;

}
