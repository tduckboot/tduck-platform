package com.tduck.cloud.project.entity.struct;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDefaultValueStruct {
    /**
     * 值是否是Json
     */
    private boolean json;
    /**
     * 默认值具体值
     */
    private Object value;


}
