package com.zyq.nongyezhongzhi.admin.service;

import com.zyq.nongyezhongzhi.admin.model.GrowerModel;

//种植户的业务接口
public interface IGrowerService {
	
	//注册用户
	public void register(GrowerModel growerModel) throws Exception;

	 //修改密码
	 public void changepassword(String id,String password) throws Exception;
}
