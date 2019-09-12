package com.xyx.account.controller;

import com.xyx.account.service.AccountService;
import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 减去账户余额
     *
     * @param userId
     * @param orderMoney
     */
    @RequestMapping(value = "/debit", produces = "application/json")
    public void debit(@RequestParam String userId, @RequestParam BigDecimal orderMoney) {
        System.out.println("account XID " + RootContext.getXID());
        accountService.debit(userId, orderMoney);
    }
}
