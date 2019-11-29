package com.fis.xiaolu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fis.xiaolu.entity.FisUser;

public interface FisUserMapper {
    /**
     */
    int deleteByPrimaryKey(Integer id);

    /**
     */
    int insert(FisUser record);

    /**
     */
    FisUser selectByPrimaryKey(Integer id);

    /**
     */
    List<FisUser> selectAll();

    /**
     */
    int updateByPrimaryKey(FisUser record);

	/**
	 * @param username
	 * @param passwd
	 * @return
	 */
	FisUser findByNameAndPasswd(@Param("username") String username, @Param("passwd") String passwd);
}