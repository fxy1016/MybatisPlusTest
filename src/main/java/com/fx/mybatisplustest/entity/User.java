package com.fx.mybstisplustest.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Author: fx
 * @PROJECT: MybstisPlusTest
 * @TIME: 2022/10/6 10:09
 * @Description:
 */
@Data
public class User {

    private Integer id;
    private String name;
    private Integer age;
}
