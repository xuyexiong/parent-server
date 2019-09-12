package com.xyx.consulclient.dao;

import com.xyx.consulclient.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: xuyexiong
 * @create: 2019/09/09 15/04
 **/
public interface UserDao {

    List<User> findUser();

    boolean deleteUser(int id);

    void createUser(User user);

    boolean updateUser(@Param("id") int id,
                       @Param("name") String name);
}
