/*
 * CHONGQING XYZ TECH CO.,LTD
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * jlcon 上午10:04:13 创建
 */
package com.montime.study.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Filename HelloWorldAction.java
 *
 * @Description:
 *
 * @Version 1.0
 *
 * @Author jlcon
 *
 * @Email 
 *
 */
@Controller
public class HelloWorldAction {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/helloworld")
	public String helloworld(){
		logger.debug("hello world!");
		return "helloworld";
	}
}
