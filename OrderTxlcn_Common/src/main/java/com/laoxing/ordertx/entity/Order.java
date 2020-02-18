package com.laoxing.ordertx.entity;

import lombok.Data;

/**
 * @program: Order_Txlcn
 * @description: \
 * @author: Feri
 * @create: 2020-02-18 15:53
 */
@Data
public class Order {
    private Integer id;
    private String oid;
    private int gid;
    private int flag;//1未付款 2 3
}
