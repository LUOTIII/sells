package com.lanxin.sell.service.impl;

import com.lanxin.sell.dto.OrderDTO;
import com.lanxin.sell.service.PaySevice;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PaySeviceImpl implements PaySevice {

    @Override
    public void create(OrderDTO orderDTO) {
        BestPayServiceImpl bestPayService = new BestPayServiceImpl();

    }
}
