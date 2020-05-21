package com.zyq.nongyezhongzhi.admin.dao;

import java.util.List;

import com.zyq.nongyezhongzhi.admin.model.UserModel;


//用户的Dao接口
public interface IUserDao {

	//增
		public void create(UserModel userModel) throws Exception;
		//u
		public void update(UserModel userModel) throws Exception;
		//d
		public void delete(UserModel userModel) throws Exception;
		//查询
		public List<UserModel> selectListByAll() throws Exception;
		//R方法-查询  查询返回单个对象，一般根据表的主键字段值获取
		public UserModel getById(String id) throws Exception;
		
}
