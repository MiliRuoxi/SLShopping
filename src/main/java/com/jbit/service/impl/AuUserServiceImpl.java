package com.jbit.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jbit.dao.AuUserDao;
import com.jbit.entity.AuUser;
import com.jbit.service.AuUserService;
@Service("auUserService")
public class AuUserServiceImpl implements AuUserService {

	@Resource
	private AuUserDao auUserDao;
	
	@Override
	public AuUser getlogin(String loginCode, String password) {
		return auUserDao.getlogin(loginCode, password);
	}

}
