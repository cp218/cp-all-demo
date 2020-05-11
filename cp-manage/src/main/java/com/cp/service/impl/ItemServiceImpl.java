package com.cp.service.impl;

import com.cp.mapper.ItemMapper;
import com.cp.service.ItemService;
import com.cp.vo.EasyUI_Table;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.cp.pojo.Item;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper itemMapper;

    @Override
    public EasyUI_Table findItemByPage(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        List<Item> itemList = itemMapper.findItemByPage();
        PageInfo<Item> page1 = new PageInfo<>(itemList);
        return new EasyUI_Table(page1.getTotal(), itemList);
    }
}
