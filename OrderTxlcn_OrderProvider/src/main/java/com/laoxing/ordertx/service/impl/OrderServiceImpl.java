package com.laoxing.ordertx.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.laoxing.ordertx.dao.OrderDao;
import com.laoxing.ordertx.entity.Order;
import com.laoxing.ordertx.provider.RepositoryService;
import com.laoxing.ordertx.service.OrderService;
import com.laoxing.ordertx.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: Order_Txlcn
 * @description:
 * @author: Feri
 * @create: 2020-02-18 16:10
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao dao;
    @Autowired
    private RepositoryService service;
    @LcnTransaction //分布式事务注解
    @Transactional  //本地事务注解
    @Override
    public R createOrder(Order order) {
        //本地事务就是指Connection上面的是
        //远程服务 分布式事务
        //生成订单
        dao.save(order);
        //更改库存---->调用库存服务--->完成库存变更
        service.change(order.getGid(), 1);

        //模拟异常 如果事务成功：不仅仅订单无效 库存更改也要回滚
        if(order.getGid()==11){
            System.out.println(1/0);
        }
        return R.ok();
    }
}
