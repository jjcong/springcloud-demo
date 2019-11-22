# springcloud-demo
My First SpringCloud Demo
## 模块说明
   + microservicecloud  
   父工程，包含以下所有模块
   + microservicecloud-api  
   通用的Entity以及其他接口
   + microservicecloud-7001   
   Eureka Server 端口：7001
   + microservicecloud-7002   
   Eureka Server 端口：7002
   + microservicecloud-7003   
   Eureka Server 端口：7003
   + microservicecloud-provider-dept-8001   
   Eureka Client 服务提供类 端口：8001
   + microservicecloud-provider-dept-8002   
   Eureka Client 服务提供类 端口：8002
   + microservicecloud-provider-dept-8003   
   Eureka Client 服务提供类 端口：8003
   + microservicecloud-dept-80   
   Eureka Client 普通方式的消费者，Ribbon+RestTemplate
   + microservicecloud-consumer-dept-80   
   Eureka Client Feign方式的消费者，Feign
   + microservicecloud-zuul-gateway-9527  
   Zuul 代理路由服务
   
        其中，microservicecloud-7001，microservicecloud-7002，microservicecloud-7003提供集群服务，保证高可靠性
    microservicecloud-provider-dept-8001，microservicecloud-provider-dept-8002，microservicecloud-provider-dept-8003组成
    多服务实例
    
    未完待续！！！
    
   