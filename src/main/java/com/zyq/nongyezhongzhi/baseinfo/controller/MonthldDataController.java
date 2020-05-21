package com.zyq.nongyezhongzhi.baseinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//月度数据控制类
@RestController
@RequestMapping("/monthlddata")
public class MonthldDataController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}
}
