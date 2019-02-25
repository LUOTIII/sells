package com.lanxin.sell.service;

import com.lanxin.sell.dto.OrderDTO;

/**
 * 买家
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消一个订单
    OrderDTO cancelOrder(String openid,String orderId);
}