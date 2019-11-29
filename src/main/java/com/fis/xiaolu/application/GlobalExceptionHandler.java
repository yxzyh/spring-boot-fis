package com.fis.xiaolu.application;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月28日下午6:00:59
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = RuntimeException.class)
	@ResponseBody
	public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		e.printStackTrace();
		return "我是个异常处理类";
	}

	@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
		return (factory -> {
			ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.do");
			factory.addErrorPages(error404Page);
		});
		
//		  WebServerFactoryCustomizer<ConfigurableWebServerFactory>  result = new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
//	            @Override
//	            public void customize(ConfigurableWebServerFactory factory) {
//	                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.do");
//	                factory.addErrorPages( error404Page);
//	            }
//	        };

	        //jdk 1.8 lambda
	       // return  result;
		
	}

}
