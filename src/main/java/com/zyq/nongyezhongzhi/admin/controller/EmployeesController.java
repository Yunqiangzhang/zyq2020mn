package com.zyq.nongyezhongzhi.admin.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//管理员控制类
@RestController
@RequestMapping("/employees")
public class EmployeesController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}

}
