package com.zyq.nongyezhongzhi.baseinfo.service;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.QuarterDataModel;


//季度数据的业务接口
public interface IQuarterDataService {
	   //增加
		public void create(QuarterDataModel quarterDataModel) throws Exception;
		 //修改
		 public void modify(QuarterDataModel quarterDataModel) throws Exception;
		 //删除
		 public void delete(QuarterDataModel quarterDataModel) throws Exception;
		 //修改数据
		 public void changequarterdata(String quarterdata) throws Exception;
		//取得所有用户列表
		
		public List<QuarterDataModel> getListByAll() throws Exception;

}
