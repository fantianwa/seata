package com.seata.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seata.order.entity.Order;
import org.apache.ibatis.annotations.Insert;

public interface OrderMapper extends BaseMapper<Order> {

//    @Insert("insert into t_order (stock_id, user_name) values (#{stockId}, #{userName})")
//    void createOrder(Order order);
}
