package com.laoxing.ordertx.controller;

import com.laoxing.ordertx.entity.Order;
import com.laoxing.ordertx.service.OrderService;
import com.laoxing.ordertx.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Order_Txlcn
 * @description:
 * @author: Feri
 * @create: 2020-02-18 16:16
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService service;

    //下单
    @PostMapping("/api/order/save.do")
    public R saveOrder(@RequestBody Order order){
        return service.createOrder(order);
    }
}
