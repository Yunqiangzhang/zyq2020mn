package com.zyq.nongyezhongzhi.yield.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//玉米产量数据控制类
@RestController
@RequestMapping("/wheatyield")
public class WheatYieldController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}
	
}
