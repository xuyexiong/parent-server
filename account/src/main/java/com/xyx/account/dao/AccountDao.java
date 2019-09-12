package com.xyx.account.dao;

import com.xyx.account.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountDao {

    /**
     * 根据用户id查询账户信息
     *
     * @param userId
     * @return
     */
    Account selectByUserId(@Param("userId") String userId);

    /**
     * 修改账户信息
     *
     * @param record
     * @return
     */
    int updateById(Account record);

}