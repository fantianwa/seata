package com.seata.stock.entity;


import lombok.Data;

@Data
public class Order {

    private Integer id;
    private Integer stockId;
    private String userName;
}
