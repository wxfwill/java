# 阶段六：JVM、并发与分布式基础

## 目标

能够采集运行证据并区分 CPU、内存、线程、数据库、缓存和网络问题，掌握必要的并发与分布式边界。

## 知识点

- 类加载、堆、栈、元空间、GC、OOM、Stack Overflow
- Thread Dump、Heap Dump、JFR、`jcmd`、`jstack`、`jmap`
- JMM、`synchronized`、`volatile`、Lock、原子类、并发集合
- 线程池、`CompletableFuture`、Virtual Thread、ThreadLocal、死锁与取消
- 缓存穿透/击穿/雪崩、分布式锁、消息、幂等、最终一致性、重试、限流和熔断

## 主资料

- Dev.java JVM 与并发章节
- Oracle Java Troubleshooting Guide
- Oracle GC Tuning Guide
- 公司实际使用的 RabbitMQ 或 Kafka 官方教程

## 注意点

- 不背诵全部 GC 参数，不为学习而强拆微服务。
- 没有真实需求时不引入消息队列、Spring Cloud 或 Kubernetes。
- 分布式方案必须建立在明确问题、证据和失败模型上。

## 验收

能采集和初步分析线程、内存与 JFR 信息，正确使用线程池和超时，并设计基本缓存一致性与幂等方案。
