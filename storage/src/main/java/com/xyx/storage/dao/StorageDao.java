package com.xyx.storage.dao;

import com.xyx.storage.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StorageDao {

    Storage selectById(@Param("id") Integer id);

    /**
     * 根据商品编号查询库存信息
     *
     * @param commodityCode
     * @return
     */
    Storage findByCommodityCode(@Param("commodityCode") String commodityCode);

    /**
     * 修改库存信息
     *
     * @param record
     * @return
     */
    int updateById(Storage record);

    void insert(Storage record);

    void insertBatch(List<Storage> records);

    int updateBatch(@Param("list") List<Long> ids, @Param("commodityCode") String commodityCode);
}