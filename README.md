# Spring-cloud
## consul服务注册发现实例
#### consul-cline     服务注册
#### consul-consumer  服务发现
#### api-gateway      网关服务

## 分布式事务seata consul myBatis实例 AT模式（启动seata服务注册到consul）
### account             用户服务
### order               订单服务
### storage             库存服务
### business            主程服务
###### 部署步骤：
1. 下载seata，修改conf目录下的registry.conf，file.conf 执行db_store.sql，db_undo_log.sql
2. 启动consul，seata ./seata-server.bat -p 8091 -m file
3. 各服务配置 registry.conf，file.conf，主程service添加全局事务注解@GlobalTransactional
4. 启动各服务