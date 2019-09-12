package com.xyx.order.dao;

import com.xyx.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {

    /**
     * 创建订单信息
     *
     * @param record
     * @return
     */
    int insert(Order record);

}