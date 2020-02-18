package com.laoxing.ordertx.dao;

import com.laoxing.ordertx.entity.Order;
import org.apache.ibatis.annotations.Insert;

/**
 * @program: Order_Txlcn
 * @description:
 * @author: Feri
 * @create: 2020-02-18 16:08
 */
public interface OrderDao {
    @Insert("insert into t_order(gid,oid,flag) values(#{gid},#{oid},1)")
    int save(Order order);

}
