package com.zyq.nongyezhongzhi.baseinfo.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.WheatModel;




//玉米水稻的Dao接口
public interface IWheatDao {
	       //增加
			public void create(WheatModel wheatModel) throws Exception;
			//
			public void update(WheatModel wheatModel) throws Exception;
			//删除
			public void delete(WheatModel wheatModel) throws Exception;
			//查询列表
			public List<WheatModel> selectListByAll() throws Exception;
		
	
}
