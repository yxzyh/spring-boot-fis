package com.fis.xiaolu.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日上午11:25:13
 */
@Component
@RabbitListener(queues = "fis")
public class Receiver {

	@RabbitHandler // 指定对消息的处理
	public void process(String msg) {
		System.out.println("receive msg : " + msg);
	}
}	
