package com.fis.xiaolu.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日上午11:22:04
 */
@Component
public class Sender {

	@Autowired
	AmqpTemplate rabbitTemplate;

	public void send() {
		rabbitTemplate.convertAndSend("fis", "this is message for rabbitmq!");
	}
}
