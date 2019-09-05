package com.xyx.consulconsumer.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("consul-client")
public interface DcService {

    @GetMapping("/dc")
    String consumer();
    
}
