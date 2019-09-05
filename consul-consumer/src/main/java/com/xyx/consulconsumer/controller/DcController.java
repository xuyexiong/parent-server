package com.xyx.consulconsumer.controller;

import com.xyx.consulconsumer.server.DcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xuyexiong
 * @create: 2019/09/04 17/19
 **/
@RestController
public class DcController {

    @Autowired
    private DcService dcService;

    @GetMapping("/consumer")
    public String dc() {
        return dcService.consumer();
    }
}
