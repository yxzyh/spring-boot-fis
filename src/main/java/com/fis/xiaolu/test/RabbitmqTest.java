package com.fis.xiaolu.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fis.xiaolu.FisApplication;
import com.fis.xiaolu.mq.Sender;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日上午11:26:33
 */
@SpringBootTest(classes = { FisApplication.class })
@RunWith(SpringRunner.class)
public class RabbitmqTest {

	@Autowired
	private Sender sender;

	@Test
	public void testRabbitmq() throws Exception {
		sender.send();
	}
}
