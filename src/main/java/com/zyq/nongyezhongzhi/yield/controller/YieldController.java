package com.zyq.nongyezhongzhi.yield.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//产量数据控制类
@RestController
@RequestMapping("/yield")
public class YieldController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}
	
}
