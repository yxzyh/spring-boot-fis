package com.fis.xiaolu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年11月29日上午8:55:15 
 */
@Controller
@RequestMapping("tpl")
public class ThymeleafController {

	@RequestMapping("testThymeleaf")
	public String testThymeleaf(ModelMap map) {
		map.addAttribute("name", "fis");
		return "testThymeleaf";
	}
}
