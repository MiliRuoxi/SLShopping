package com.jbit.dao;

import com.jbit.entity.GoodsInfoWithBLOBs;

public interface GoodsInfoDao {
    GoodsInfoWithBLOBs selectByPrimaryKey(Long id);
}