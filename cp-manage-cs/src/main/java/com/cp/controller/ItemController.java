package com.cp.controller;

import com.cp.service.ItemService;
import com.cp.vo.EasyUI_Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	/*
	 * 1..根据分页信息实现查询
	 * 复习:
	 * 	SpringMVC取赋值过程
	 * 
	 * 如下: http://localhost:8091/item/query?page=1&rows=20
	 * 	String page = request.getParameter("page");
		String rows = request.getParameter("rows");
		int intPage = Integer.parseInt(page);
		int intRows = Integer.parseInt(rows);
		以上过程SpringMVC写好了,但是我们传值一定要与提交的参数一致
		
	 */
	@RequestMapping("/query")
	public EasyUI_Table findItemByPage(Integer page, Integer rows) {
		
		return itemService.findItemByPage(page,rows);
	}
	
}
