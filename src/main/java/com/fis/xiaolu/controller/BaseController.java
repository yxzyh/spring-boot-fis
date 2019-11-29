package com.fis.xiaolu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年11月28日下午6:05:32 
 */
@RestController
public class BaseController {

	@RequestMapping("/404.do")
	public Object error_404() {
		return "你的接口地址被送去火星了。";
	}
}
