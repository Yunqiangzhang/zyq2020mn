package com.zyq.nongyezhongzhi.admin.service;

import com.zyq.nongyezhongzhi.admin.model.EmployeesModel;

//管理员的业务接口
public interface IEmployeesService {
   
	 //注册用户
	 public void register(EmployeesModel employeesModel) throws Exception;
	 //修改用户
	 public void modify(EmployeesModel employeesModel) throws Exception;
	 //修改密码
	 public void changepassword(String id,String password) throws Exception;
}
