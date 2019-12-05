package com.fis.xiaolu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年11月28日下午3:55:01 
 */

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
@MapperScan("com.fis.xiaolu.dao")
public class FisApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisApplication.class, args);
	}
	
}
