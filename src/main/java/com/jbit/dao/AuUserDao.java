package com.jbit.dao;



import com.jbit.entity.AuUser;

public interface AuUserDao {
	/**
	 * 登录功能
	 * @param loginCode
	 * @param password
	 * @return
	 */
     AuUser getlogin(String loginCode,String password);

}