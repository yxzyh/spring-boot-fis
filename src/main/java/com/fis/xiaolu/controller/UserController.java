package com.fis.xiaolu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fis.xiaolu.service.impl.UserServiceImpl;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年11月28日下午4:10:09 
 */

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserServiceImpl service;
	
	private final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("say")
	public String sayHello() {
		System.out.println("print log!");
		logger.debug("这是一个hello日志！");
		return "Hello World!";
	}
	
	@RequestMapping("login")
	public String login(String username,String passwd) {
		boolean b = service.login(username, passwd);
		if(b) {
			return "登录成功";
		}else {
			return "登录失败";
		}
	}
	
	@RequestMapping("register")
	public String register(String username,String passwd) {
		boolean b = service.register(username, passwd);
		if(b) {
			return "注册成功";
		}else {
			return "注册失败";
		}
	}
	
	
	@RequestMapping("/batchAdd")
	@Transactional
    public String batchAdd(String username,String passwd) {
	  service.batchAdd(username, passwd);
      return "成功";
    }
}
