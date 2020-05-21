package com.zyq.nongyezhongzhi.admin.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//用户控制类
@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}

}
