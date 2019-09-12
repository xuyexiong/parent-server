package com.xyx.consulclient.service;

import com.xyx.consulclient.entity.User;

import java.util.List;

public interface UserService {

    List<User> findUser();

    void createUser(String name);

    boolean deleteUser(int Id);

    boolean updateUser(int Id, String name);
}
