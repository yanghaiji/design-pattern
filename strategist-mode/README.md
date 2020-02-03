## Strategist Model 

本文主要讲解策略模式，进行实验模拟

##  需求讲解

- demo 背景

    模拟电商用户选择商品时的金额以及邮费计算，根据用户级别计算商品及邮费价格
    
- 开发前提
    
    用户分类：普通用户，VIP用户,VVIP用户
    
    费用计算模式：普通用户全额收取，VIP用户七折收取，VVIP用户五折收取
    
## 开发步骤

- 定义策略接口 PriceService
- 定义上文获取类 CustomerContext
- 实现策略接口，并继续费用计算(OrdinaryService / VipService)
- 模拟请求   http://localhost:8090/strategist/getPrice
![full stack developer tutorial](../doc/img/1.png)

这里以实现普通用户和VIP用户的开发，后续增加VVIP用户，或者更多用户，
只需要实现策略接口即可，对原来的需求不产生影响，实现了良好的可款展现

