package com.fis.xiaolu.service;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月28日下午5:12:04
 */
public interface IUserService {
	
	boolean login(String username, String passwd);
	boolean register(String username, String passwd);
	void batchAdd(String username,String passwd);
}
