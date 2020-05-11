package com.cp.service;

import com.cp.vo.EasyUI_Table;

public interface ItemService {

	EasyUI_Table findItemByPage(Integer page, Integer rows);

}
