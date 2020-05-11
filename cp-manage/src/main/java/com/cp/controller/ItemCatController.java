package com.cp.controller;

import com.cp.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item/cat")
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;

    /**
     * 业务说明:
     * 	根据页面商品分类id号查询商品分类名称
     *利用ajax进行异步提交
     *	url:"/item/cat/queryItemName"
     *     参数:  itemCatId:val
     *     返回值类型:   返回具体分类名称
     */
    @RequestMapping("/queryItemName")
    public String findItemCatNameById(Long itemCatId) {

        return itemCatService.findItemCatNameById(itemCatId);
    }
}
