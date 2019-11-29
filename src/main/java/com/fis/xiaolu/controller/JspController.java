package com.fis.xiaolu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年11月28日下午6:33:33 
 */
@Controller
@RequestMapping("/jsp")
public class JspController {
	
	@RequestMapping("/hi")
	public String sayHi() {
		System.out.println("+++++++++++++++++++=");
		return "index";
	}
}
