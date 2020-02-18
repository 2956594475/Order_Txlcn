package com.laoxing.ordertx.controller;

import com.laoxing.ordertx.service.RepositoryService;
import com.laoxing.ordertx.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Order_Txlcn
 * @description:
 * @author: Feri
 * @create: 2020-02-18 16:03
 */
@RestController
public class RepositoryController {
    @Autowired
    private RepositoryService service;

    //更改库存
    @PostMapping("/provider/repository/changecount.do")
    public R change(@RequestParam int gid, @RequestParam int count){
        //模拟 库存服务出问题
        return service.changeCount(gid, count);
    }
}
