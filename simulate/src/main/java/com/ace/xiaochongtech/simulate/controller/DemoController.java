package com.ace.xiaochongtech.simulate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ace.xiaochongtech.simulate.SimulateApplication;

@RestController
public class DemoController {
	
	public static Logger LOG = LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping("/index")
	public String index() {
		LOG.info("测试请求");
		return "success";
	}
	
	

}
