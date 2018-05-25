package com.jbit.dao;

import com.jbit.entity.Information;

public interface InformationDao {
    Information selectByPrimaryKey(Long id);
}