package com.fis.xiaolu.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fis.xiaolu.FisApplication;
import com.fis.xiaolu.dao.FisUserMapper;
import com.fis.xiaolu.entity.FisUser;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年11月28日下午4:41:50 
 */
@SpringBootTest(classes = {FisApplication.class})
@RunWith(SpringRunner.class)
public class UserTest {
	
	@Resource
	FisUserMapper fisUserMapper;
	
	@Test
	public void testAdd() {
		FisUser user = new FisUser();
		user.setUsername("fis01");
		user.setPasswd("123");
		fisUserMapper.insert(user);
		
	}
	
	@Test
	public void testFindUser() {
		FisUser user = fisUserMapper.findByNameAndPasswd("fis","123");
		System.out.println(user);
	}

}
