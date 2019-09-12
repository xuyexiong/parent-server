package com.xyx.order.service;

import com.xyx.order.dao.OrderDao;
import com.xyx.order.entity.Order;
import com.xyx.order.feign.AccountFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class OrderService {

    @Autowired
    private AccountFeignClient accountFeignClient;
    @Autowired
    private OrderDao orderDao;

    public void create(String userId, String commodityCode, Integer count) {
        BigDecimal orderMoney = new BigDecimal(count).multiply(new BigDecimal(5));
        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setCount(count);
        order.setMoney(orderMoney);

        orderDao.insert(order);

        accountFeignClient.debit(userId, orderMoney);

    }
}
