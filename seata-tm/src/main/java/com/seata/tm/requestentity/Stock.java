package com.seata.tm.requestentity;

import lombok.Data;

@Data
public class Stock {

    private Integer id;
    private String name;
    private Integer count;
}
