package com.laoxing.ordertx.service;

import com.laoxing.ordertx.entity.Order;
import com.laoxing.ordertx.vo.R;

/**
 * @program: Order_Txlcn
 * @description:
 * @author: Feri
 * @create: 2020-02-18 16:10
 */
public interface OrderService {
    R createOrder(Order order);
}
