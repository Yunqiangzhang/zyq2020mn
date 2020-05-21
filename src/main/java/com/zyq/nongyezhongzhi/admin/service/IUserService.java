package com.zyq.nongyezhongzhi.admin.service;

import com.zyq.nongyezhongzhi.admin.model.UserModel;

//用户的业务接口
public interface IUserService {
  //注册用户
public void register(UserModel userModel) throws Exception;
//修改用户
public void modify(UserModel userModel) throws Exception;

//修改密码
public void changepassword(String id,String password) throws Exception;
//删除用户
public void delete(UserModel userModel) throws Exception;
	
	//R方法-查询  查询返回单个对象，一般根据表的主键字段值获取
public UserModel getById(String id) throws Exception;
}


