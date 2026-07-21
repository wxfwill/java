# 阶段五：测试、部署与故障排查

## 目标

建立从自动化测试、容器部署、健康检查到故障定位和回滚的交付闭环。

## 知识点

- JUnit 5、Mockito、MockMvc、Spring Boot Test、Testcontainers
- Linux、JAR、JVM 参数、Dockerfile、Compose、Nginx
- 环境变量、密钥、健康检查、CI/CD、发布与回滚
- 结构化日志、Trace ID、Actuator、Metrics、连接池和线程池

## 主资料

- Spring Boot Testing Reference
- Testcontainers JUnit 5 Quickstart
- Docker Get Started 与 Compose Documentation
- Nginx Beginner's Guide
- Spring Boot Actuator Reference

## 故障练习

模拟数据库/Redis 不可用、Token 过期、SQL 超时、线程池耗尽、配置缺失、端口冲突、磁盘不足、容器失败、Nginx 错误、外部超时和重复提交。

## 注意点

排查时先读完整异常，定位第一个自身代码栈，检查输入、配置和 SQL，构造最小复现后再查资料或询问 AI。

## 验收

能通过 Compose 启动 Vue、Nginx、Spring Boot、MySQL 和 Redis，完成测试、监控、发布和回滚。
