package com.jbit.dao;

import com.jbit.entity.MultiLan;

public interface MultiLanDao {
    MultiLan selectByPrimaryKey(String elementId);
}