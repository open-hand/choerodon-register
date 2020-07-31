# hzero-register

## 特征

基于Eureka的平台注册中心服务

## 服务配置

- `application.yml`

  ```yaml
    eureka:
      instance:
        preferIpAddress: true
        leaseRenewalIntervalInSeconds: 2
        leaseExpirationDurationInSeconds: 4
        metadata-map:
          VERSION: 1.4.0
      client:
        # 检索服务选项，注册中心不需要检索服务
        fetch-registry: ${EUREKA_CLIENT_FETCH_REGISTRY:false}
        # 注册中心将自己作为客户端来尝试注册自己，注册中心集群环境下需开启此配置
        register-with-eureka: ${EUREKA_CLIENT_REGISTER_WITH_EUREKA:false}
        serviceUrl:
          defaultZone: ${EUREKA_DEFAULT_ZONE:http://dev.hzero.org:8000/eureka}
        registryFetchIntervalSeconds: 10
        disable-delta: true
      server:
        # 清除失效服务间隔时间
        evictionIntervalTimerInMs: 3000
        enable-self-preservation: ${EUREKA_SERVER_ENABLE_SELF_PRESERVATION:false}
        # 响应数据缓存有效期
        response-cache-update-interval-ms: 3000
        response-cache-auto-expiration-in-seconds: 180

  ```

- `bootstrap.yml`

  ```yaml
  spring:
    application:
      name: hzero-register
  server:
    port: 8000
  management:
    server:
      port: 8001
  ```

## 环境需求

- mysql 5.6+
- redis 3.0+

## 安装和启动步骤

- 本地启动 redis-server

- 启动项目，项目根目录下执行如下命令：

  ```sh
   mvn spring-boot:run
  ```
  
## 更新日志

* [更新日志](./CHANGELOG.zh-CN.md)


## 如何参与

欢迎参与我们的项目，了解更多有关如何[参与贡献](https://github.com/choerodon/choerodon/blob/master/CONTRIBUTING.md)的信息。

