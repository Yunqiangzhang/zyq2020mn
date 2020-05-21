package com.zyq.nongyezhongzhi.baseinfo.service;

import java.util.List;

import com.zyq.nongyezhongzhi.baseinfo.model.RiceModel;


//水稻的业务接口
public interface IRiceService {
	//增加
	public void create(RiceModel riceModel) throws Exception;
	 //修改
	 public void modify(RiceModel riceModel) throws Exception;
	 //删除
	 public void delete(RiceModel riceModel) throws Exception;
	 //修改数据
	 public void changeyield(String yield) throws Exception;
	//取得所有用户列表
	
	public List<RiceModel> getListByAll() throws Exception;
}
