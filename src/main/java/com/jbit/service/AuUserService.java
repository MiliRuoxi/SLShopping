package com.jbit.service;

import org.apache.ibatis.annotations.Param;

import com.jbit.entity.AuUser;

public interface AuUserService {
	/**
	 * 登录功能
	 * @param loginCode
	 * @param password
	 * @return
	 */
     AuUser getlogin(@Param("loginCode")String loginCode,@Param("password")String password);
}
