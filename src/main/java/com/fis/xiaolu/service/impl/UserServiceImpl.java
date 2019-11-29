package com.fis.xiaolu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.xiaolu.dao.FisUserMapper;
import com.fis.xiaolu.entity.FisUser;
import com.fis.xiaolu.service.IUserService;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月28日下午5:13:43
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private FisUserMapper fisUserMapper;

	@Override
	public boolean login(String username, String passwd) {
		FisUser user = fisUserMapper.findByNameAndPasswd(username, passwd);
		return user != null;
	}

	@Override
	public boolean register(String username, String passwd) {
		FisUser users = new FisUser();
		users.setUsername(username);
		users.setPasswd(passwd);
		int cnt = fisUserMapper.insert(users);
		return cnt > 0;
	}

	@Override
	public void batchAdd(String username, String passwd) {
		FisUser users = new FisUser();
		users.setUsername(username);
		users.setPasswd(passwd);
		fisUserMapper.insert(users);
		
		int i = 10/0;
		users = new FisUser();
		users.setUsername(username+"2");
		users.setPasswd(passwd);
		fisUserMapper.insert(users);
		
	}

}
