package com.zyq.nongyezhongzhi.admin.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.admin.model.EmployeesModel;

//管理员的Dao接口
public interface IEmployeesDao {
	  //增加
	public void create(EmployeesModel employeesModel) throws Exception;
	//
	public void update(EmployeesModel employeesModel) throws Exception;
	//删除
	public void delete(EmployeesModel employeesModel) throws Exception;
	//查询列表
	public List<EmployeesModel> selectListByAll() throws Exception;
}
