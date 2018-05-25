package com.jbit.dao;

import com.jbit.entity.Inventory;

public interface InventoryDao {
    Inventory selectByPrimaryKey(String id);
}