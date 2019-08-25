package com.huawei.nlz.springplayground.nosql.redis;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable {   //注意对象必须要实现Serializable接口。

    /**
     * 角色编号
     */
    private String roleId;

    /**
     * 角色权限列表
     */
    private List<String> authIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
