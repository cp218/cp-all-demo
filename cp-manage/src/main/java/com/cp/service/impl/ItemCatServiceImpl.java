package com.cp.service.impl;

import com.cp.mapper.ItemCatMapper;
import com.cp.service.ItemCatService;
import com.cp.pojo.ItemCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public String findItemCatNameById(Long itemCatId) {

        ItemCat itemCat = itemCatMapper.selectById(itemCatId);
        return itemCat.getName();
    }
}
