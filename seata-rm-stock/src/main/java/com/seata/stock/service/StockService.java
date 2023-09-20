package com.seata.stock.service;

import com.seata.stock.entity.Stock;

public interface StockService {

    void reduceStock(Stock stock);
}
