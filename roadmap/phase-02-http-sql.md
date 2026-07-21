# 阶段二：HTTP、SQL 与数据库

## 目标

不依赖 ORM 和 AI，独立设计权限数据库、编写多表 SQL、处理事务并定义稳定的 REST API 契约。

## 知识点

- HTTP 方法、状态码、Header、Cookie、Session、Token、CORS、缓存和幂等
- 主键、外键、唯一约束和表关系
- JOIN、聚合、子查询、索引与 `EXPLAIN`
- 事务、隔离级别、锁、死锁、分页和批量操作
- 字符集、时区、金额精度、大整数与 Flyway 迁移

## 主资料

- MDN HTTP
- SQLBolt
- MySQL 8.4 Reference Manual
- Flyway Documentation
- OWASP Top 10

## 练习

在 `exercises/phase-02-sql` 中完成权限系统建表、15 条多表查询、用户权限查询、事务回滚、并发更新、慢查询分析和数据库迁移。

## 注意点

- 查看真实 SQL，识别 N+1、循环查询、无索引分页与内存分页。
- 数据正确不代表查询在数据量扩大后仍然可用。
- 金额使用 `BigDecimal`；时间明确时区；超出 JavaScript 安全范围的 ID 与前端约定字符串传输。

## 验收

能够设计权限数据库、使用事务完成授权、通过 `EXPLAIN` 分析索引，并解释 `401`、`403`、`409` 和 `500`。
