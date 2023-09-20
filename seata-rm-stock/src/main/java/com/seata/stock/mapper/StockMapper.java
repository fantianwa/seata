package com.seata.stock.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seata.stock.entity.Stock;
import org.apache.ibatis.annotations.Update;

public interface StockMapper extends BaseMapper<Stock> {

    @Update("update t_stock set count = count - ${count} where id = ${id}")
    void reduceStock(Stock stock);
}
