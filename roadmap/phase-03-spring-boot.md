# 阶段三：Spring 与 Spring Boot

## 目标

理解 Spring 基本机制，独立完成一个分层清晰、可测试并可与 Vue 联调的业务模块。

## 知识点

- IoC、依赖注入、Bean 生命周期、Component Scan、自动配置
- AOP、代理、事务代理与 Spring MVC 请求流程
- Filter、Interceptor、Argument Resolver、配置与 Profile
- Controller、Service、Repository、DTO、VO、Entity
- Validation、全局异常、JSON、日志、文件、定时任务和外部 HTTP
- JDBC、Spring Data JPA、MyBatis、OpenAPI

## 主资料

- Spring Guides
- Spring Boot Reference
- Spring Framework Reference
- Spring Data JPA Reference
- MyBatis Getting Started

## 实践顺序

1. 无数据库 REST API。
2. JDBC 数据访问。
3. JPA 重写。
4. MyBatis 独立查询模块。
5. 参数校验、异常、OpenAPI 和 Vue 联调。

## 注意点

- Controller 不写数据库逻辑和事务。
- Entity 不直接接收外部请求或作为公共响应。
- 必须解释 `@Transactional` 失效、同类调用绕过代理、Filter 与 Interceptor 差异等问题。

## 验收

不借助 AI 生成代码，独立完成表结构、接口、分层、事务、分页、测试和前后端联调。
