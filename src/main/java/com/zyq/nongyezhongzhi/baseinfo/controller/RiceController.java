package com.zyq.nongyezhongzhi.baseinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//水稻控制类
@RestController
@RequestMapping("/rice")
public class RiceController {
	@RequestMapping("/add")
	public String add() throws Exception{
		return"增加成功";
	}
}
