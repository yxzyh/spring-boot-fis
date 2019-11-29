package com.fis.xiaolu.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import com.fis.xiaolu.FisApplication;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日上午10:48:20
 */
@SpringBootTest(classes = FisApplication.class)
@RunWith(SpringRunner.class)
public class SpringRedisTest {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Test
	public void testRedis() throws Exception {
		ValueOperations<String, String> ops = redisTemplate.opsForValue();
		ops.set("name", "fis");
		String value = ops.get("name");
		System.out.println(value);
	}
}
