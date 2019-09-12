package com.xyx.consulclient.controller;

import com.xyx.consulclient.entity.User;
import com.xyx.consulclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: xuyexiong
 * @create: 2019/09/09 15/16
 **/
@RestController
public class UserAPI {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findUsers() {
        return userService.findUser();
    }

    @PostMapping("/users")
    public void createUser(@RequestBody Map<String, String> map) {
        userService.createUser(map.get("name"));
    }

    @DeleteMapping("/users/{id}")
    public boolean deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }

    @PatchMapping("/users/{id}")
    public boolean updateUser(@PathVariable int id, @RequestBody Map<String, String> map) {
        return userService.updateUser(id, map.get("name"));
    }
}
