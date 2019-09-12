package com.xyx.consulclient.service.Impl;

import com.xyx.consulclient.dao.UserDao;
import com.xyx.consulclient.entity.User;
import com.xyx.consulclient.service.UserService;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: xuyexiong
 * @create: 2019/09/09 15/04
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUser() {
        return userDao.findUser();
    }

    @Override
    public void createUser(String name) {
        User user = new User();
        user.setName(name);
        userDao.createUser(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public boolean updateUser(int id, String name) {
        boolean flag = userDao.updateUser(id, name);
        Validate.isTrue(!flag, "哇哈哈哈哈");
        return flag;
    }
}
