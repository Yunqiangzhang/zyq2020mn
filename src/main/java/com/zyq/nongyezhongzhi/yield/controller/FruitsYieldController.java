package com.zyq.nongyezhongzhi.yield.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//水果产量控制类
@RestController
@RequestMapping("/fruitsyield")
public class FruitsYieldController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}
	
}
