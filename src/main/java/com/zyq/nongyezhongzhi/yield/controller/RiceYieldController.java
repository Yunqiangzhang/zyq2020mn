package com.zyq.nongyezhongzhi.yield.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//水稻产量数据控制类
@RestController
@RequestMapping("/riceyield")
public class RiceYieldController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}
	
}
