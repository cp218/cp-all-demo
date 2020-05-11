package com.cp.vo;

import com.cp.pojo.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class EasyUI_Table {
    private Long total;	//总记录数
    private List<Item> rows;//分页后记录数

}
