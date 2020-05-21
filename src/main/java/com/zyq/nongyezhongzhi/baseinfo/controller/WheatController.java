package com.zyq.nongyezhongzhi.baseinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//玉米控制类
@RestController
@RequestMapping("/wheat")
public class WheatController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}
}
