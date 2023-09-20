package com.seata.tm.requestentity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Request implements Serializable {

    private Integer id;
    private Integer count;
    private String userName;
}
