package com.cp.controller;

import com.cp.service.ItemService;
import com.cp.vo.EasyUI_Table;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Resource
    private ItemService itemService;
    /**
     * 1.根据分页信息实现查询
     * 	SpringMVC取赋值过程
     * 	http://localhost:8091/item/query?page=1&rows=50
     注意:SpringMVC中方法的参数名称必须与提交的参数一致!!!!
     */
    @RequestMapping("/query")
    public EasyUI_Table findItemByPage(Integer page, Integer rows) {

        return itemService.findItemByPage(page,rows);
    }
}
