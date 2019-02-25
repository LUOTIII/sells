package com.lanxin.sell.service;

import com.lanxin.sell.dto.OrderDTO;

public interface PaySevice {
    void create(OrderDTO orderDTO);
}
