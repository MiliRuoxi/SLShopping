package com.jbit.dao;

import com.jbit.entity.AserRefer;

public interface AserReferDao {
    AserRefer selectByPrimaryKey(String referLogId);
}