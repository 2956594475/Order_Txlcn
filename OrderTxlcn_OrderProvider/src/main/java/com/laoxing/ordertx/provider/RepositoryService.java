package com.laoxing.ordertx.provider;

import com.laoxing.ordertx.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: Order_Txlcn
 * @description:
 * @author: Feri
 * @create: 2020-02-18 16:13
 */
@FeignClient("repprovider")
public interface RepositoryService {
    //更改库存
    @PostMapping("/provider/repository/changecount.do")
    R change(@RequestParam int gid, @RequestParam int count);
}