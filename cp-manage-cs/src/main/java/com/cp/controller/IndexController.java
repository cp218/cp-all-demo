package com.cp.controller;

import com.cp.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	/**
	 * RestFul风格   必会内容
	 * 1.url中的参数必须使用"/"分割
	 * 2.服务端获取数据时,必须使用"{}"包裹参数
	 * 3.使用@PathVariable注解实现数据转化
	*/

	@RequestMapping("/page/{moduleName}")
	public String addItem(@PathVariable String moduleName) {
		System.out.println(moduleName);
		return moduleName;
	}
	
	
	//与上面相同(很少使用,都用上面样式)
	//不同之处: 当{}内的参数moduleName01与定义的参数abc不同时,
	//使用@PathVariable(value = "moduleName01")将{}参数传递给abc;
	/*
	 * @RequestMapping("/page/{moduleName01}")
	 * public String addItem01(@PathVariable(value = "moduleName01") String abc) {
	 * 		return abc;
	 * }
	 */


	/**
	 * 使用时需要保证参数与属性一致
	 * @param item
	 * @return
	 * 简化get操作
	 */
	@RequestMapping("/saveItem/{title}/{sellPoint}/{price}")
	@ResponseBody
	public Item saveItem(Item item) {
		return item;
	}

	//需要取单个或其中几个属性时,使用此方法,一般使用上面的saveItem()
//	@RequestMapping("/saveItem/{title}/{sellPoint}/{price}")
//	@ResponseBody
//	public Item saveItem01(
//			@PathVariable String title,
//			@PathVariable String sellPoint,
//			@PathVariable Long price) {
//		Item item = new Item();
//		item.setTitle(title).setSellPoint(sellPoint).setPrice(price);
//		return item;
//	}

	@RequestMapping("/getMSG")
	@ResponseBody
	public String getMSG() {
		return "我是8091服务器";
	}
}
