package com.laoxing.ordertx.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @program: Order_Txlcn
 * @description:
 * @author: Feri
 * @create: 2020-02-18 16:00
 */
public interface RepositoryDao {
    //更改库存
    @Update("update t_repository set count=count-#{count} where gid=#{gid}")
    int changeCount(@Param("gid") int gid,@Param("count") int count);
}
