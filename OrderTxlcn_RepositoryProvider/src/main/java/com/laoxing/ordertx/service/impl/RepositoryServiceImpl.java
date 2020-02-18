package com.laoxing.ordertx.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.laoxing.ordertx.dao.RepositoryDao;
import com.laoxing.ordertx.service.RepositoryService;
import com.laoxing.ordertx.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: Order_Txlcn
 * @description:
 * @author: Feri
 * @create: 2020-02-18 16:02
 */
@Service
public class RepositoryServiceImpl implements RepositoryService {
    @Autowired
    private RepositoryDao dao;
    @LcnTransaction //lcn模式
    @Transactional  //本地事务注解
    @Override
    public R changeCount(int gid, int count) {
        System.err.println("库存服务："+gid);
        if(dao.changeCount(gid, count)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }
}