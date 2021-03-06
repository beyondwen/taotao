package com.taotao.service;

import com.taotao.pojo.EasyUIResult;
import com.taotao.pojo.TbItem;

public interface ItemService {

    TbItem getItemById(long itemId);

    EasyUIResult getItemList(Integer page, Integer rows);
}
