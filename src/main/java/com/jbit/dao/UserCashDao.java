package com.jbit.dao;

import com.jbit.entity.UserCash;

public interface UserCashDao {
    UserCash selectByPrimaryKey(String cashId);
}