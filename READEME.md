# Springboot zipkin

Springboot and zipkin.

分布式服务的调用链和日志处理.


本项目依赖`zipkin`,开启本项目前请保证`zipkin-server`已经正常开启.

---

## 1. 项目说明

| 模块名称                   | 作用     | 备注 |
| -------------------------- | -------- | ---- |
| springboot-zipkin-business | 业务入口 | -    |
| springboot-zipkin-order    | 订单业务 | -    |
| springboot-zipkin-account  | 账户业务 | -    |
| springboot-zipkin-common   | 公共模块 | -    |


---

## 2. 启动项目


启动顺序: `springboot-zipkin-account` -> `springboot-zipkin-order` -> `springboot-zipkin-business`.


请求样例

```html
curl 127.0.0.1:8080/api/biz/createOrder
```

返回数据

```json
{
    "status": 1,
    "data": {
        "orderId": "O1586095750175",
        "account": "cs12110",
        "price": 1024.0,
        "createTime": "2020-04-05T14:09:10.176+0000"
    },
    "list": null,
    "timestamp": 1586095750516
}
```

---

## 4. 参考资料

a. [zipkin官方文档](https://zipkin.io/)






