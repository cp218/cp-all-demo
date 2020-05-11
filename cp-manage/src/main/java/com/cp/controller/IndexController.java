package com.cp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 编辑通用跳转
 */
@Controller
public class IndexController {
    /**
     * RestFul风格
     * 1.url中的参数必须使用"/"分割
     * 2.服务端获取数据时,必须使用"{}"包裹参数
     * 3.使用@PathVariable注解实现数据转化
     */
    @RequestMapping("/page/{moudelName}")
    public String addItem(@PathVariable String moudelName){
        System.out.println("进入" + moudelName);
        return moudelName;
    }

    @RequestMapping("/")
    public String index(){
        System.out.println("进入");
        return "index";
    }
}
