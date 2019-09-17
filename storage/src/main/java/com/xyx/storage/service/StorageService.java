package com.xyx.storage.service;

import com.xyx.storage.dao.StorageDao;
import com.xyx.storage.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

/**
 * @author jimin.jm@alibaba-inc.com
 * @date 2019/06/14
 */
@Service
public class StorageService {

    @Autowired
    private StorageDao storageDao;

    @Transactional(rollbackFor = Exception.class)
    public void deduct(String commodityCode, int count) {
        Storage storage = storageDao.findByCommodityCode(commodityCode);
        storage.setCount(storage.getCount() - count);
        storageDao.updateById(storage);
    }
}
