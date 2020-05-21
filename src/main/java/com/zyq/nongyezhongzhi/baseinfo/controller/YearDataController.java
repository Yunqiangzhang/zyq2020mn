package com.zyq.nongyezhongzhi.baseinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//年度数据控制类
@RestController
@RequestMapping("/yeardata")
public class YearDataController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}
}
