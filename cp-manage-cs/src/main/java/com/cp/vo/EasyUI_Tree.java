package com.cp.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//VO:是服务器数据与页面交互的对象, 一般都需要转换为JSON
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class EasyUI_Tree {
	private Long id; //分类的ID号
	private String text; //分类名称
	private String state; //状态, open/closed
}
