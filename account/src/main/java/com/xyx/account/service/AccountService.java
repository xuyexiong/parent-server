package com.xyx.account.service;

import com.xyx.account.dao.AccountDao;
import com.xyx.account.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountService {

    private static final String ERROR_USER_ID = "1002";

    @Autowired
    private AccountDao accountDao;

    public void debit(String userId, BigDecimal num) {
        Account account = accountDao.selectByUserId(userId);
        account.setMoney(account.getMoney().subtract(num));
        accountDao.updateById(account);

        if (ERROR_USER_ID.equals(userId)) {
            throw new RuntimeException("指定账户抛出异常");
        }
    }
}
