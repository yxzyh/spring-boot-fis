package com.fis.xiaolu.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年11月29日上午11:19:57 
 */
@Configuration
public class RabbitConfig {
	 @Bean
     public Queue firstQueue() {
       // 创建一个队列，名称为：fis
        return new Queue("fis");
     }
}
