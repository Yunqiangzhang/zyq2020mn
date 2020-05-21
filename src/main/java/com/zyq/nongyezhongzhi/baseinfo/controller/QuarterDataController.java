package com.zyq.nongyezhongzhi.baseinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//季度数据控制类
@RestController
@RequestMapping("/quarterdata")
public class QuarterDataController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}
}
