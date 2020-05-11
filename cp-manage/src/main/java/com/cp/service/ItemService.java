package com.cp.service;

import com.cp.vo.EasyUI_Table;

public interface ItemService {
    /**
     * 当前页，限制数
     * @param page
     * @param rows
     * @return
     */
    EasyUI_Table findItemByPage(Integer page, Integer rows);

}
