package com.xyx.order.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author jimin.jm@alibaba-inc.com
 * @date 2019/06/14
 */
@FeignClient("account-service")
public interface AccountFeignClient {

    /**
     * 减少账户余额
     *
     * @param userId
     * @param orderMoney
     * @return
     */
    @GetMapping("/debit")
    void debit(@RequestParam("userId") String userId,
               @RequestParam("orderMoney") BigDecimal orderMoney);
}
