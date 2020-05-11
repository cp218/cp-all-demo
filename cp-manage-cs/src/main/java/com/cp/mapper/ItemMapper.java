package com.cp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cp.pojo.Item;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemMapper extends BaseMapper<Item>{
	@Select("select * from tb_item order by updated desc limit #{start},#{rows}")
	List<Item> findItemByPage(
            @Param("start") Integer start,
            @Param("rows") Integer rows);

	/*
	 *  关于mybatis传参问题
	 * ~~~~~~~~~~~~~~~~~~~~~~~
	 *  规则: mybatis中默认是不允许多值传参
	 *  需要用户将多值转化为单值
	 * 1.本身数据就是一个参数
	 * 2.将数据使用对象进行封装
	 * 3.使用集合进行封装  list array
	 * 4.无论参数是什么都可以封装为map集合
	 */
	void deleteItems(Long[] ids);

	//4.无论参数是什么都可以封装为map集合,
	void updateStatus(@Param("ids") Long[] ids, @Param("status") int status);
}
